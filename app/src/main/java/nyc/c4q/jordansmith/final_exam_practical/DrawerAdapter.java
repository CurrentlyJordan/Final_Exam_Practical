package nyc.c4q.jordansmith.final_exam_practical;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by jordansmith on 2/12/17.
 */

public class DrawerAdapter extends RecyclerView.Adapter<DrawerViewHolder> {

    List<ButtonType> drawerButtons;
    Listener listener;

    DrawerAdapter(List<ButtonType> drawerButtons, Listener listener) {
        this.drawerButtons = drawerButtons;
        this.listener = listener;
    }

    @Override
    public DrawerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.drawer_item_view, parent, false);

        return new DrawerViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(DrawerViewHolder holder, int position) {
        holder.onBind(drawerButtons.get(position), listener);

    }

    @Override
    public int getItemCount() {
        return drawerButtons.size();
    }
}
