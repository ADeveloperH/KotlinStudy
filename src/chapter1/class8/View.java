package chapter1.class8;

import org.jetbrains.annotations.Nullable;

public class View {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * Register a callback to be invoked when this view is clicked. If this view is not
     * clickable, it becomes clickable.
     *
     * @param l The callback that will run
     */
    public void setOnClickListener(@Nullable OnClickListener l) {
        System.out.println("clicklistener 被调用了");
        l.onClick(this);
    }

    /**
     * Interface definition for a callback to be invoked when a view is clicked.
     */
    public interface OnClickListener {
        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
        void onClick(View v);
    }
}
