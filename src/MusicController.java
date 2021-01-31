import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.*;
import java.util.*;

public class MusicController {
    private String errorMessage = "Please, put in correct number of command";

    private static String ROOT_FOLDER_PATH = "D:/Asha/settings.txt";
    private static String MUSIC_FOLDER_PATH = "/Music";
    private static String MUSIC_LIST_FILE_PATH = "/Music list.txt";

    private Map<MusicType, List<File>> audioFiles;

    //  private static final String MUSIC_DIR_PATH;
    public MusicController(String rootFolderPath) throws IOException, UnsupportedAudioFileException {
        ROOT_FOLDER_PATH = rootFolderPath;

        initFolders();


//        AudioFormat format = audioInputStream.getFormat();
//        long frames = audioInputStream.getFrameLength();
//        double durationInSeconds = (frames+0.0) / format.getFrameRate();
//        initPaths();
//
//        Scanner in = new Scanner(System.in);
//        int commandNumber = 0;
//        System.out.println("Hello! Let's do something");
//        showMenu();
//        while (commandNumber != 8) {
//            try {
//                System.out.println("Put in command number, please");
//                commandNumber = in.nextInt();
//                commandAction(commandNumber);
//            } catch (Exception e) {
//                System.out.println(errorMessage);
//                in = new Scanner(System.in);
//            }
//        }
    }

    private void initFolders() {
        audioFiles = new HashMap<>();
        for (MusicType musicType : MusicType.values()) {
            File musicFolder = new File(ROOT_FOLDER_PATH + MUSIC_FOLDER_PATH + musicType.folderPath);
            List<File> folderAudios = new ArrayList<>(Arrays.asList(Objects.requireNonNull(musicFolder.listFiles())));
            audioFiles.put(musicType, folderAudios);
        }
    }

//
//    private void showMenu() {
//        String menuString = "1 - Start engine\n" +
//                "2 - Up transmission\n" +
//                "3 - Push gas pedal\n" +
//                "4 - Down transmission\n" +
//                "5 - Show speed\n" +
//                "6 - Turn off engine\n" +
//                "7 - Help\n" +
//                "8 - Exit\n";
//        System.out.println(menuString);
//    }

//    private void commandAction(int commandNumber) {
//        // в case очень накрученная логика или упрощай или выноси в отдельный метод
//        switch (commandNumber) {
//            case (1):
//                car.getEngine().turnOn();
//                break;
//            case (2):
//                if (car.getEngine().isWork()) {
//                    if (!car.isWork() && car.getTransmission().getGear() == 0) {
//                        car.getTransmission().upTransmission();
//                    } else {
//                        if (car.isWork()) {
//                            car.getTransmission().upTransmission();
//                        } else {
//                            System.out.println("Sorry, I can't do it. Car isn't moving");
//                        }
//                    }
//                } else {
//                    System.out.println("Sorry, I can't do it. Engine isn't working");
//                }
//                break;
//            case (3):
//                if (car.getEngine().isWork()) {
//                    if (car.getTransmission().getGear() > 0) {
//                        car.pushGasPedal();
//                    } else {
//                        System.out.println("Sorry, I can't do it. Gear is zero");
//                    }
//                } else {
//                    System.out.println("Sorry, I can't do it. Engine isn't working");
//                }
//                break;
//            case (4):
//                if (car.isWork()) {
//                    car.getTransmission().downTransmission();
//                } else {
//                    System.out.println("Sorry, I can't do it. Car isn't moving");
//                }
//                break;
//            case (5):
//                System.out.println("Current car speed is " + car.getCurrentSpeed());
//                break;
//            case (6):
//                if (car.getCurrentSpeed() == 0) {
//                    car.getEngine().turnOff();
//                    car.turnOff();
//                } else {
//                    System.out.println("Sorry, I can't do it. Car is moving");
//                }
//                break;
//            case (7):
//                showMenu();
//                break;
//            case (8):
//                if (car.getCurrentSpeed() > 0) {
//                    System.out.println("Wow. You're really crazy to go out on the speed of " + car.getCurrentSpeed() + ".");
//                    System.out.println("Don't try suicide - nobody's worth it (Queen)");
//                } else {
//                    if (car.getEngine().isWork()) {
//                        System.out.println("It wasn't great idea to leave the engine turned on");
//                    }
//                }
//                System.out.print("Bye-bye");
//                break;
//            default:
//                System.out.println(errorMessage);
//        }
//    }
}
