package chapter2.item01;

/**
 * 이 클래스의 인스턴스는 #getInstance() 메서드를 통해서만 생성되며, 생성된 인스턴스는 어플리케이션 전체에서 공유된다.
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private Settings(){}

    private static final Settings SETTINGS = new Settings();

    public static Settings getInstance() {
        return SETTINGS;
    }
}
