package nyc.c4q.jordansmith.final_exam_practical;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jordansmith on 2/12/17.
 */

public class SettingsAdapter extends RecyclerView.Adapter<SettingsViewHolder> {

    String numberText;

    SettingsAdapter(String numberText) {
        this.numberText = numberText;
    }


    @Override
    public SettingsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView textView = new TextView(parent.getContext());
        return new SettingsViewHolder(textView);
    }

    @Override
    public void onBindViewHolder(SettingsViewHolder holder, int position) {
        String number = String.valueOf(position);
        holder.textView.setText(numberText + " " + number);

    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
