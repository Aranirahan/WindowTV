package as.khamdan.imk.Beanclass;

/**
 * Created by khamdan on 07/01/2017.
 */
public class BeanclassVid {
    private int image;
    private String title,subtitle,shop;


    public BeanclassVid(int image, String title, String subtitle, String shop){

        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.shop = shop;



    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }


}
