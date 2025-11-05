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

        while(!raylib.WindowShouldClose()){

            if ( raylib.IsKeyPressed(raylib.KEY_LEFT)  && direction != 2 ) direction = 0;
            if ( raylib.IsKeyPressed(raylib.KEY_UP)    && direction != 3 ) direction = 1;
            if ( raylib.IsKeyPressed(raylib.KEY_RIGHT) && direction != 0 ) direction = 2;
            if ( raylib.IsKeyPressed(raylib.KEY_DOWN)  && direction != 1 ) direction = 3;

            
            raylib.BeginDrawing();

            raylib.ClearBackground(Colors.BLACK);

            raylib.DrawRectangle((int)apple.x()*60, (int)apple.y()*60, 60, 60, Colors.RED);
            for(int i = 0; i < snake.size(); i++){
                raylib.DrawRectangle((int)snake.get(i).x()*60,(int)snake.get(i).y()*60, 60, 60, Colors.GREEN);
            }

            raylib.EndDrawing();
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

            boolean appleEaten = false;
            if(snake.getFirst().x() == apple.x() && snake.getFirst().y() == apple.y()){
                apple.x((float)(int)(Math.random() * 10));
                apple.y((float)(int)(Math.random() * 10));
                score++;
                raylib.SetWindowTitle(String.format("Snake - Score: %d", score));
                appleEaten = true;
                snake.add(snake.getLast());
            }
            if(direction != -1){
                for(int i = 0; i < snake.size(); i++){
                    
                }
            }
        }
        apple.close();
    }
}
