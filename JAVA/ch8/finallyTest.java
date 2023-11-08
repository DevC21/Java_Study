package JAVA.ch8;

public class finallyTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws Exception {
        copyFiles();
    }

    static void copyFiles() throws Exception {
        throw new Exception("파일 복사중 오류");
    }

    static void deleteTempFiles() {
        System.out.println("임시파일 삭제 완료");
    }
}
