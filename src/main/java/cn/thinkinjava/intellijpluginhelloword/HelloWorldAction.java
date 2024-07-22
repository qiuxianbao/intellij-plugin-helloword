package cn.thinkinjava.intellijpluginhelloword;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

/**
 * show hello world
 * @author qiuxianbao
 * @date 2024/07/22
 * @since acp_2.5.0_20240606
 */
public class HelloWorldAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        String message = "Hello world!";
        Messages.showInfoMessage(e.getProject(), message, "Title");
    }
}
