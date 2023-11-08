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
        throw new Exception("���� ������ ����");
    }

    static void deleteTempFiles() {
        System.out.println("�ӽ����� ���� �Ϸ�");
    }
}
