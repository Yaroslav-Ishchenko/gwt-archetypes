package ${package}.client.view;

import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;

public interface SouthView extends IsWidget {
	void setPresenter(Presenter presenter);

	HasText getValue();
	
	public interface Presenter {
		
	}
}
