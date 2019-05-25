package admin;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.*;

public class LogoutAction extends ActionSupport {
    @Override
  public String execute() throws Exception {
    Map session = ActionContext.getContext().getSession();
    session.remove("logged-in");
    return SUCCESS;
    }
}
