package lesson4;

public class Main1 {

    public static void main(String[] args) throws InterruptedException {
        // Задача создать и запустить программу
        // Которая будет работать беспрерывно 5 лет (если мы не будем выключать ноутбук)
        //Программа будет каждую секунду писать на консоль сколько времени прошло от момента старта

        for(int year = 0; year < 5; year++){
            for (int month = 0; month < 12; month++){
                for(int day = 0; day < 30; day++){
                    for(int hour = 0; hour < 24; hour++){
                        for (int minute = 0; minute < 60; minute++){
                            for(int second = 0; second < 60; second++){
                                System.out.printf("От старта прошло : %d года, %d месяца, %d дней , %d часов, %d минут, %d секунд \n",year, month, day, hour, minute, second);
                                Thread.sleep(1000);
                            }
                        }
                    }
                }
            }
        }

    }

}
