import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    static private String season;
    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }

    public static void setSeason(String season) {
        Forest.season = season;
        if (season.equals("зима")){
            MountainHare.color = "белый";
        } else {
            MountainHare.color = "серо-рыжий";
        }
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }



}

