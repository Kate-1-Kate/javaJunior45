package lesson6.saper;

public class MainSap {

    public static void main(String[] args) {

        String level = ScannerUtils.getLevel();

        int[][] field = SaperUtils.getGameField(level);
        SaperUtils.fildRandomMines(field, level);


    }

}
