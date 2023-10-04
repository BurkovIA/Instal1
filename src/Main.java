import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static <append> void main(String[] args) throws IOException {
        File dir1 = new File("C://Game");
        File dir2 = new File("C://Game/src");
        File dir3 = new File("C://Game/res");
        File dir4 = new File("C://Game/savegames");
        File dir5 = new File("C://Game/temp");

        dir1.mkdir();
        if (dir1.exists()) {
            String message1 = "C://Game - каталог создан";
            try (FileWriter fileWriter = new FileWriter("C://Game/temp//temp.txt", true)) {
                byte[] bytes = message1.getBytes();
                fileWriter.write(message1 + "\n");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("C://Game - каталог не создан");
        }

        dir2.mkdir();
        if (dir2.exists()) {
            String message2 = "C://Game/src - каталог создан";
            try (FileWriter fileWriter = new FileWriter("C://Game/temp//temp.txt", true)) {
                byte[] bytes = message2.getBytes();
                fileWriter.write(message2 + "\n");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("C://Game/src - каталог не создан");
        }

        dir3.mkdir();
        if (dir3.exists()) {
            String message3 = "C://Game/res - каталог создан";
            try (FileWriter fileWriter = new FileWriter("C://Game/temp//temp.txt", true)) {
                byte[] bytes = message3.getBytes();
                fileWriter.write(message3 + "\n");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("C://Game/res - каталог не создан");
        }

        dir4.mkdir();
        if (dir4.exists()) {
            String message4 = "C://Game/savegames - каталог создан";
            try (FileWriter fileWriter = new FileWriter("C://Game/temp//temp.txt", true)) {
                byte[] bytes = message4.getBytes();
                fileWriter.write(message4 + "\n");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("C://Game/savegames - каталог не создан");
        }

        dir5.mkdir();
        if (dir5.exists()) {
            String message5 = "C://Game/temp - каталог создан";
            try (FileWriter fileWriter = new FileWriter("C://Game/temp//temp.txt", true)) {
                byte[] bytes = message5.getBytes();
                fileWriter.write(message5 + "\n");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("C://Game/temp - каталог не создан");
        }

        File dir6 = new File("C://Game/src/main");
        File dir7 = new File("C://Game/src/test");

        dir6.mkdirs();
        if (dir6.exists()) {
            String message6 = "C://Game/src/main - каталог создан";
            try (FileWriter fileWriter = new FileWriter("C://Game/temp//temp.txt", true)) {
                byte[] bytes = message6.getBytes();
                fileWriter.write(message6 + "\n");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("C://Game/src/main - каталог не создан");
        }

        dir7.mkdirs();
        if (dir7.exists()) {
            String message7 = "C://Game/src/test - каталог создан";
            try (FileWriter fileWriter = new FileWriter("C://Game/temp//temp.txt", true)) {
                byte[] bytes = message7.getBytes();
                fileWriter.write(message7 + "\n");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("C://Game/src/test - каталог не создан");
        }

        File file1 = new File("C://Game/src/main//Main.java");
        File file2 = new File("C://Game/src/main//Utils.java");


        file1.createNewFile();
        if (file1.exists()) {
            String message8 = "C://Game/src/main//Main.java - файл создан";
            try (FileWriter fileWriter = new FileWriter("C://Game/temp//temp.txt", true)) {
                byte[] bytes = message8.getBytes();
                fileWriter.write(message8 + "\n");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        file2.createNewFile();
        if (file2.exists()) {
            String message9 = "C://Game/src/main//Utils.java - файл создан";
            try (FileWriter fileWriter = new FileWriter("C://Game/temp//temp.txt", true)) {
                byte[] bytes = message9.getBytes();
                fileWriter.write(message9 + "\n");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        File dir8 = new File("C://Game/res/drawables");
        File dir9 = new File("C://Game/res/vectors");
        File dir10 = new File("C://Game/res/icons");

        dir8.mkdirs();
        if (dir8.exists()) {
            String message10 = "C://Game/res/drawables - каталог создан";
            try (FileWriter fileWriter = new FileWriter("C://Game/temp//temp.txt", true)) {
                byte[] bytes = message10.getBytes();
                fileWriter.write(message10 + "\n");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("C://Game/res/drawables - каталог не создан");
        }

        dir9.mkdirs();
        if (dir9.exists()) {
            String message11 = "C://Game/res/vectors - каталог создан";
            try (FileWriter fileWriter = new FileWriter("C://Game/temp//temp.txt", true)) {
                byte[] bytes = message11.getBytes();
                fileWriter.write(message11 + "\n");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("C://Game/res/vectors - каталог не создан");
        }

        dir10.mkdirs();
        if (dir10.exists()) {
            String message12 = "C://Game/res/icons - каталог создан";
            try (FileWriter fileWriter = new FileWriter("C://Game/temp//temp.txt", true)) {
                byte[] bytes = message12.getBytes();
                fileWriter.write(message12 + "\n");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("C://Game/res/icons - каталог не создан");
        }

        File file3 = new File("C://Game/temp//temp.txt");

        file3.createNewFile();
        if (file3.exists()) {
            String message13 = "C://Game/temp//temp.txt - файл создан";
            try (FileWriter fileWriter = new FileWriter("C://Game/temp//temp.txt", true)) {
                byte[] bytes = message13.getBytes();
                fileWriter.write(message13 + "\n");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}