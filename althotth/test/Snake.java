package althotth.test;

import com.raylib.*;

import java.util.*;
public class Snake {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Raylib raylib = new Raylib();
        raylib.InitWindow(600, 600, "Snake");
        raylib.SetTargetFPS(10);

        ArrayList<Raylib.Vector2> snake = new ArrayList<Raylib.Vector2>();
        
        Raylib.Vector2 apple = new Raylib.Vector2( );
        apple.x((float)(int)(Math.random() * 10));
        apple.y((float)(int)(Math.random() * 10));
        int direction = -1; // 0 = left, 1 = up, 2 = right, 3 = down

        Raylib.Vector2 startPos = new Raylib.Vector2();
        startPos.x(0);
        startPos.y(0);
        snake.add(startPos);

        int score = 0;
        boolean shouldUpdate = true;

        int sinceLastApple = 0;
        while(!raylib.WindowShouldClose()){

            if ( raylib.IsKeyPressed(raylib.KEY_LEFT)  && direction != 2 ) direction = 0;
            if ( raylib.IsKeyPressed(raylib.KEY_UP)    && direction != 3 ) direction = 1;
            if ( raylib.IsKeyPressed(raylib.KEY_RIGHT) && direction != 0 ) direction = 2;
            if ( raylib.IsKeyPressed(raylib.KEY_DOWN)  && direction != 1 ) direction = 3;

            
            raylib.BeginDrawing();

            raylib.ClearBackground(Colors.BLACK);

            raylib.DrawRectangle((int)apple.x()*60, (int)apple.y()*60, 60, 60, Colors.RED);
            for(int i = 0; i < snake.size(); i++){
                raylib.DrawRectangle((int)snake.get(i).x()*60+10,(int)snake.get(i).y()*60+10, 40, 40, Colors.GREEN);
            }

            if(shouldUpdate){
                if(snake.getFirst().x() == apple.x() && snake.getFirst().y() == apple.y()){
                    apple.x((float)(int)(Math.random() * 10));
                    apple.y((float)(int)(Math.random() * 10));
                    score++;
                    raylib.SetWindowTitle(String.format("Snake - Score: %d", score));
                    Raylib.Vector2 newSnakeBlock = new Raylib.Vector2();

                    newSnakeBlock.x(snake.getLast().x());
                    newSnakeBlock.y(snake.getLast().y());
                    snake.add(newSnakeBlock);
                    sinceLastApple = 0;
                }
                if(direction != -1){
                    for(int i = snake.size()-1; i > 0; i--){
                        if((sinceLastApple < 2 && i != snake.size() - 1) || sinceLastApple >= 2){
                            snake.get(i).x(snake.get(i-1).x());
                            snake.get(i).y(snake.get(i-1).y());

                        }
                    }
                }
                switch(direction){
                    case 0:
                        snake.getFirst().x(snake.getFirst().x() - 1);
                        break;
                    case 1:
                        snake.getFirst().y(snake.getFirst().y() - 1);
                        break;
                    case 2:
                        snake.getFirst().x(snake.getFirst().x() + 1);
                        break;
                    case 3:
                        snake.getFirst().y(snake.getFirst().y() + 1);
                        break;
                }
                sinceLastApple++;

            }
            else{
                raylib.DrawText("GAME OVER", 100, 100, 40, Colors.RED);
            }

            
            raylib.EndDrawing();
        }
        apple.close();
    }
}
