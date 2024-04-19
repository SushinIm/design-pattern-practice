package builder.builder;

import builder.model.Desktop;

public class DesktopBuilder {
    private String computerCase;
    private String cpu;
    private String ram;
    private String mainBoard;
    private String storage;
    private String graphic;
    private String odd;
    private String cooler;

    public DesktopBuilder computerCase(String computerCase) {
        this.computerCase = computerCase;
        return this;
    }

    public DesktopBuilder cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public DesktopBuilder ram(String ram) {
        this.ram = ram;
        return this;
    }

    public DesktopBuilder mainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
        return this;
    }

    public DesktopBuilder storage(String storage) {
        this.storage = storage;
        return this;
    }

    public DesktopBuilder graphic(String graphic) {
        this.graphic = graphic;
        return this;
    }

    public DesktopBuilder odd(String odd) {
        this.odd = odd;
        return this;
    }

    public DesktopBuilder cooler(String cooler) {
        this.cooler = cooler;
        return this;
    }

    public Desktop build() {
        return new Desktop(computerCase, cpu, ram, mainBoard, storage, graphic, odd, cooler);
    }
}
