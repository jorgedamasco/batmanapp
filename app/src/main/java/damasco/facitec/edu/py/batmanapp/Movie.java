package damasco.facitec.edu.py.batmanapp;

/**
 * Created by LUIS on 09/11/2016.
 */
public class Movie {

    private int id;
    private String Title;
    private String Year;
    private String Type;
    private String Poster;

    public int getid() {
        return id;
    }




    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        this.Year = year;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) { Type = type;}




    @Override
    public String toString() {
        return "Movie{" +
                "Id=" + id +
                ", Title='" + Title + '\'' +
                ", Year='" + Year + '\'' +
                ", Type='" + Type + '\'' +
                ", Poster='" + Poster + '\'' +
                '}';
    }
}
