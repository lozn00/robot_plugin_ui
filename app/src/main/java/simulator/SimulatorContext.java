package simulator;

import android.content.Context;
import android.view.ContextThemeWrapper;

/**
 * Created by qssq on 2018/5/17 qssq666@foxmail.com
 */
public class SimulatorContext extends ContextThemeWrapper {

    public SimulatorContext() {
    }

    public SimulatorContext(Context base, int themeResId) {
        super(base, themeResId);
    }

    public static Context createContext(){
        return new SimulatorContext();
    }

    @Override
    public ClassLoader getClassLoader() {
        return this.getClassLoader();
    }
}
