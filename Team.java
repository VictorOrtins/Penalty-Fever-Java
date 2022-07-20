import java.util.Objects;

public class Team {

    public static final int NO_STRIPES = 1;
    public static final int VERTICAL_STRIPES = 2;
    public static final int HORIZONTAL_STRIPES = 3;

    private String name;
    private int shirtFormat;
    private String primaryColor;
    private String secondaryColor;

    public Team(String name){
        this.name = name;

        this.shirtFormat = 0;
        this.primaryColor = null;
        this.secondaryColor = null;
    }

    public Team(String name, int shirtFormat, String primaryColor){
        this.name = name;
        this.shirtFormat = shirtFormat;
        this.primaryColor = primaryColor;

        this.secondaryColor = null;
    }

    public Team(String name, int shirtFormat, String primaryColor, String secondaryColor){
        this.name = name;
        this.shirtFormat = shirtFormat;
        this.primaryColor = primaryColor;

        if (checkIfStripes()){
            this.secondaryColor = secondaryColor;
            return;
        }

        this.secondaryColor = null;
    }

    public boolean checkIfStripes(){
        if (this.shirtFormat == VERTICAL_STRIPES || this.shirtFormat == HORIZONTAL_STRIPES){
            return true;
        }

        return false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShirtFormat() {
        return this.shirtFormat;
    }

    public void setShirtFormat(int shirtFormat) {
        this.shirtFormat = shirtFormat;
    }

    public String getPrimaryColor() {
        return this.primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return this.secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Team)) {
            return false;
        }
        Team team = (Team) o;
        return Objects.equals(name, team.name) && shirtFormat == team.shirtFormat && Objects.equals(primaryColor, team.primaryColor) && Objects.equals(secondaryColor, team.secondaryColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shirtFormat, primaryColor, secondaryColor);
    }


    @Override
    public String toString() {
        return
            "Name = " + getName() + 
            "Shirt Format = " + getShirtFormat()  +
            "Primary Color = " + getPrimaryColor() +
            "Secondary Color = " + getSecondaryColor();
    }





}
