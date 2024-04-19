package builder.model;

public class Desktop {
    private final String computerCase;
    private final String cpu;
    private final String ram;
    private final String mainBoard;
    private final String storage;

    private String graphic;
    private String odd;
    private String cooler;

    public Desktop(String computerCase, String cpu, String ram, String mainBoard, String storage,
            String graphic, String odd, String cooler) {
        if (computerCase == null || cpu == null || ram == null || mainBoard == null || storage == null) {
            throw new IllegalArgumentException("필수값 누락");
        }

        this.computerCase = computerCase;
        this.cpu = cpu;
        this.ram = ram;
        this.mainBoard = mainBoard;
        this.storage = storage;
        this.graphic = graphic;
        this.odd = odd;
        this.cooler = cooler;
    }
}
