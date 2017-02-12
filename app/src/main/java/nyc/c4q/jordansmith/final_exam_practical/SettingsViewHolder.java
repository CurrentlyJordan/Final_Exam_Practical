package nyc.c4q.jordansmith.final_exam_practical;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jordansmith on 2/12/17.
 */

public class SettingsViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public SettingsViewHolder(TextView itemView) {
        super(itemView);
        textView = itemView;
        textView.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
    }
}
