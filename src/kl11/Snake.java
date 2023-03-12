package kl11;
// 导入Scanner类，用于接收用户输入
import java.util.Scanner;

// 定义一个贪吃蛇类
public class Snake {
    // 定义地图的大小
    public static final int ROWS = 20;
    public static final int COLS = 20;
    // 定义蛇的身体用*表示，食物用#表示，空白用.表示
    public static final char BODY = '*';
    public static final char FOOD = '#';
    public static final char BLANK = '.';
    // 定义蛇的移动方向，上下左右分别用WASD表示
    public static final char UP = 'W';
    public static final char DOWN = 'S';
    public static final char LEFT = 'A';
    public static final char RIGHT = 'D';
    // 定义一个二维数组作为地图
    private char[][] map;
    // 定义一个变量记录蛇的长度
    private int length;
    // 定义两个一维数组记录蛇的身体坐标
    private int[] row;
    private int[] col;
    // 定义一个变量记录蛇的移动方向
    private char direction;
    // 定义一个Scanner对象接收用户输入
    private Scanner input;

    // 贪吃蛇类的构造方法，初始化地图和蛇的属性
    public Snake() {
        // 创建地图数组对象
        map = new char[ROWS][COLS];
        // 遍历地图数组，将每个元素赋值为空白字符
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                map[i][j] = BLANK;
            }
        }
        // 初始化蛇的长度为3
        length = 3;
        // 创建身体坐标数组对象，长度为地图大小的一半
        row = new int[ROWS * COLS / 2];
        col = new int[ROWS * COLS / 2];
        // 初始化蛇的身体坐标，使其位于地图中央，呈水平状
        for (int i = 0; i < length; i++) {
            row[i] = ROWS / 2;
            col[i] = COLS / 2 - i;
            // 将地图上对应的位置赋值为身体字符
            map[row[i]][col[i]] = BODY;
        }
        // 初始化蛇的移动方向为右
        direction = RIGHT;
        // 创建Scanner对象
        input = new Scanner(System.in);
        // 在地图上随机生成一个食物
        createFood();
    }

    // 定义一个方法，在地图上随机生成一个食物
    public void createFood() {
        // 定义两个变量作为食物的坐标，初始值为-1
        int foodRow = -1;
        int foodCol = -1;
        // 循环生成食物的坐标，直到不与蛇身重合为止
        do {
            // 使用Math.random()方法生成0到1之间的随机数，乘以行列数并取整得到食物坐标
            foodRow = (int) (Math.random() * ROWS);
            foodCol = (int) (Math.random() * COLS);
            // 如果食物坐标与蛇身重合，则继续循环，否则退出循环
        } while (map[foodRow][foodCol] == BODY);
        // 将地图上对应的位置
// 将地图上对应的位置赋值为食物字符
        map[foodRow][foodCol] = FOOD;
    }

    // 定义一个方法，打印地图
    public void printMap() {
        // 遍历地图数组，打印每个元素
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(map[i][j]);
            }
            // 每打印一行换行
            System.out.println();
        }
    }

    // 定义一个方法，控制蛇的移动
    public void move() {
        // 定义两个变量作为蛇头的新坐标，初始值为蛇头的当前坐标
        int newRow = row[0];
        int newCol = col[0];
        // 根据蛇的移动方向，计算蛇头的新坐标
        switch (direction) {
            case UP:
                newRow--;
                break;
            case DOWN:
                newRow++;
                break;
            case LEFT:
                newCol--;
                break;
            case RIGHT:
                newCol++;
                break;
        }
        // 判断蛇头的新坐标是否越界或者撞到自己，如果是，则游戏结束
        if (newRow < 0 || newRow >= ROWS || newCol < 0 || newCol >= COLS || map[newRow][newCol] == BODY) {
            System.out.println("Game Over!");
            // 退出程序
            System.exit(0);
        }
        // 判断蛇头的新坐标是否有食物，如果有，则蛇长大一格，并在地图上重新生成一个食物
        if (map[newRow][newCol] == FOOD) {
            length++;
            createFood();
        } else {
            // 如果没有食物，则将蛇尾的位置赋值为空白字符
            map[row[length - 1]][col[length - 1]] = BLANK;
        }
        // 将蛇身的坐标数组向前移动一格，即每个元素的值等于它前面一个元素的值
        for (int i = length - 1; i > 0; i--) {
            row[i] = row[i - 1];
            col[i] = col[i - 1];
        }
        // 将蛇头的坐标数组赋值为新坐标
        row[0] = newRow;
        col[0] = newCol;
        // 将地图上对应的位置赋值为身体字符
        map[row[0]][col[0]] = BODY;
    }

    // 定义一个方法，接收用户输入并改变蛇的移动方向
    public void changeDirection() {
        // 使用Scanner对象读取用户输入的一个字符，并转换为大写字母
        char inputChar = input.next().toUpperCase().charAt(0);
        // 判断输入的字符是否是WASD之一，如果是，则将蛇的移动方向赋值为该字符
        if (inputChar == UP || inputChar == DOWN || inputChar == LEFT || inputChar == RIGHT) {
            direction = inputChar;
        }
    }

    // 定义一个主方法，创建贪吃蛇对象并开始游戏循环
    public static void main(String[] args) {
        // 创建贪吃蛇对象
        Snake snake = new Snake();
// 无限循环
        while (true) {
            // 打印地图
            snake.printMap();
            // 接收用户输入并改变方向
            snake.changeDirection();
            // 控制蛇移动
            snake.move();
        }
    }
}