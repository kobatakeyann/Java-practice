package basis.chapter_17.exercise.no1_3_4;

public enum State {
    AVAILABLE("貸出可能"), CHECKED_OUT("貸出中"), DEACCESSIONED("廃止");

    private final String stateInJapanese;

    private State(String state) {
        this.stateInJapanese = state;
    }

    public String getStateInJapanese() {
        return this.stateInJapanese;
    }
}
