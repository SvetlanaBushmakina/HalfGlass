public class HalfGlass {
    public static void main(String[] args) {

        final int volumeGlass = 300;
        System.out.println("Объем стакана: "+ volumeGlass + " милилитров");

        final double percentOfWaterGlass = 0.5;
        System.out.println("Cтакан заполнен на " + percentOfWaterGlass * 100 + " %");

        final double volumeWaterOfGlass = volumeGlass * percentOfWaterGlass;
        System.out.println(percentOfWaterGlass * 100 + " % - это " + volumeWaterOfGlass + " милилитров");
    }
}
