
package com.smilo.bullpen;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class ListViewService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return (new ListViewFactory(this.getApplicationContext(),
                intent));
    }

}