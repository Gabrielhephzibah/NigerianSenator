package com.cherish.nigeriansenator.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.cherish.nigeriansenator.R;

import java.util.ArrayList;
import java.util.List;





public class SenatorAdapter extends ArrayAdapter<SenatorList> {
    Filter mFliter;
    private Context mcontext;

    private List<SenatorList> senatorList;
    public ArrayList<SenatorList> senator;

    public SenatorAdapter(@NonNull Context context, @SuppressLint("SupportAnnotationUsage") @LayoutRes ArrayList<SenatorList> list) {
        super(context, 0 , list);
        mcontext = context;
        senatorList = list;
    }


    public Filter getFilter() {
        return new Filter() {

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                final FilterResults oReturn = new FilterResults();
                final ArrayList<SenatorList> results = new ArrayList<SenatorList>();
                if (senator == null)
                    senator= (ArrayList<SenatorList>) senatorList;
                if (constraint != null) {
                    if (senator != null && senator.size() > 0) {
                        for (final SenatorList g : senator) {
                            if (g.getState().toLowerCase()
                                    .contains(constraint.toString()))
                                results.add(g);
                        }
                    }
                    oReturn.values = results;
                }
                return oReturn;
            }

            @SuppressWarnings("unchecked")
            @Override
            protected void publishResults(CharSequence constraint,
                                          FilterResults results) {
                senatorList = (ArrayList<SenatorList>) results.values;
                notifyDataSetChanged();
            }
        };
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mcontext).inflate(R.layout.senator_layout,parent,false);

        SenatorList senator = senatorList.get(position);
        TextView first = listItem.findViewById(R.id.first);
        first.setText(senator.getFirst());

        TextView middle = listItem.findViewById(R.id.middle);
        middle.setText(senator.getMiddle());

        TextView second  = listItem.findViewById(R.id.second);
        second.setText(senator.getSecond());

        TextView gmail = listItem.findViewById(R.id.gmail);
        gmail.setText(senator.getEmail());

        TextView state = listItem.findViewById(R.id.state);
        state.setText(senator.getState());

        TextView circleText = listItem.findViewById(R.id.circleText);
        circleText.setText(senator.getMiddle());


        TextView number  = listItem.findViewById(R.id.number);
        number.setText(senator.getNumber());

        return listItem;
    }

    @Override
    public int getCount() {
        if(senatorList.size() > 10){
            return 10;
        }else{
            return senatorList.size();
        }
    }





}
