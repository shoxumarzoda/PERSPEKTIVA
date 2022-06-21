package uz.ithelp.perspektiva;

import java.io.Serializable;

public class ModelRcycler implements Serializable {
    private String lessonName;
    private String loadUrl;


    public ModelRcycler(String lessonName, String loadUrl) {
        this.lessonName = lessonName;
        this.loadUrl = loadUrl;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLoadUrl() {
        return loadUrl;
    }

    public void setLoadUrl(String loadUrl) {
        this.loadUrl = loadUrl;
    }
}
