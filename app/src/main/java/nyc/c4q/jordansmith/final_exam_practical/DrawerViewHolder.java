package nyc.c4q.jordansmith.final_exam_practical;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jordansmith on 2/12/17.
 */
public class DrawerViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView textView;

    public DrawerViewHolder(View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.item_view_button_icon);
        textView = (TextView) itemView.findViewById(R.id.item_view_button_text);
    }

    public void onBind(final ButtonType buttonNumber, final Listener listener){
        switch(buttonNumber){
            case BUTTON1:
                imageView.setImageResource(R.drawable.ic_drawer_button_1);
                textView.setText(R.string.button_1);
                break;
            case BUTTON2:
                imageView.setImageResource(R.drawable.ic_drawer_button_2);
                textView.setText(R.string.button_2);
                break;
            case BUTTON3:
                imageView.setImageResource(R.drawable.ic_drawer_button_3);
                textView.setText(R.string.button_3);
                break;
            case BUTTON4:
                imageView.setImageResource(R.drawable.ic_drawer_button_4);
                textView.setText(R.string.button_4);
                break;

        }

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (buttonNumber){
                    case BUTTON1:
                        listener.button1Action();
                        break;
                    case BUTTON2:
                        listener.button2Action();
                        break;
                    case BUTTON3:
                        listener.button3Action();
                        break;
                    case BUTTON4:
                        listener.button4Action();
                        break;
                }
            }
        });


    }
}
