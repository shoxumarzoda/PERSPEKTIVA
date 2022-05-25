package uz.ithelp.perspektiva.ui.gallery;

import java.io.Serializable;

public class ModelRcycler implements Serializable {

    private int imgID;
    private String lessonName;
    private String textName;
    private String loadUrl;

    public ModelRcycler(int imgID, String lessonName, String textName, String loadUrl) {
        this.imgID = imgID;
        this.lessonName = lessonName;
        this.textName = textName;
        this.loadUrl = loadUrl;
    }


    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public String getLoadUrl() {
        return loadUrl;
    }

    public void setLoadUrl(String loadUrl) {
        this.loadUrl = loadUrl;
    }
}
