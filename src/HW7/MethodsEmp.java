package HW7;

public class MethodsEmp {

    //поиск сотрудника в массиве по его именипоиск сотрудника в массиве по его имени
    public static void findEmployeeName(Employee[] workers, String name) {
        for (Employee worker : workers) {
            if (worker.getName().equals(name)) {
                System.out.println(worker.getName() + "\n" + worker.getSalary());
                System.out.println("_____________________");
            }
        }

    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static void findEmployeePartofName(Employee[] workers, String name) {
        for (Employee worker : workers) {
            if (worker.getName().contains(name)) {
                System.out.println(worker.getName() + "\n" + worker.getSalary());
                System.out.println("_____________________");
            }
        }

    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static void countBudgectForSalaries(Employee[] workers) {
        double budget = 0;
        for (Employee worker : workers) {
            budget += worker.getSalary();
        }
        System.out.println(budget);
        System.out.println("============================");
    }

    //поиск наименьшей зарплаты в массив
    public static void findMinSalary(Employee[] workers) {
        double minSalary = workers[0].getSalary();
        for (Employee worker : workers) {
            if (worker.getSalary() < minSalary) {
                minSalary = worker.getSalary();
            }
        }
        System.out.println(minSalary);
        System.out.println("============================");
    }


    //поиск наибольшей зарплаты в массиве
    public static void findMaxSalary(Employee[] workers) {
        double maxSalary = Integer.MIN_VALUE;
        for (Employee worker : workers) {
            if (worker.getSalary() > maxSalary) {
                maxSalary = worker.getSalary();
            }
        }
        System.out.println(maxSalary);
        System.out.println("============================");
    }

    //поиск наименьшего количества подчиненных в массиве менеджеров
    public static void findMinAmountOfSub(Employee[] employees) {
        int minSub = Integer.MAX_VALUE;
        boolean managerFound = false;

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                if (manager.getNumberOfSubordinates() < minSub) {
                    minSub = manager.getNumberOfSubordinates();
                    managerFound = true;
                }
            }
        }


        if (managerFound) {
            System.out.println("Максимальное количество подчиненных: " + minSub);
        } else {
            System.out.println("Менеджеры не найдены.");
        }

        System.out.println("============================");
    }

    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static void findMaxAmountOfSub(Employee[] employees) {
        int maxSub = Integer.MIN_VALUE;
        boolean managerFound = false;

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                if (manager.getNumberOfSubordinates() > maxSub) {
                    maxSub = manager.getNumberOfSubordinates();
                    managerFound = true;
                }
            }
        }

        if (managerFound) {
            System.out.println("Максимальное колич подчиненных: " + maxSub);
        } else {
            System.out.println("Менеджеры не найдены.");
        }

        System.out.println("============================");
    }

    //поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public static void findMaxBonus(Employee[] employees) {
        double maxBonus = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                if (manager.getSalary() - manager.getBaseSalary() > maxBonus) {
                    maxBonus = manager.getSalary() - manager.getBaseSalary();
                }
            }

        }
        System.out.println(maxBonus);
        System.out.println("============================");

    }

    //поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public static void findMinBonus(Employee[] employees) {
        double minBonus = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                if (manager.getSalary() - manager.getBaseSalary() < minBonus) {
                    minBonus = manager.getSalary() - manager.getBaseSalary();
                }
            }

        }
        System.out.println(minBonus);
        System.out.println("============================");

    }
}
