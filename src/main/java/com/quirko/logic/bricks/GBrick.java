
package com.quirko.logic.bricks;
import com.quirko.logic.MatrixOperations;
import java.util.ArrayList;
import java.util.List;

final class GBrick implements Brick{
    private final List<int[][]> brickMatrix = new ArrayList<>();

    public GBrick() {
        brickMatrix.add(new int[][]{
                {0, 0, 0, 0},
                {7, 7, 0, 0},
                {0, 7, 7, 0},
                {0, 0, 0, 0}
        });
        brickMatrix.add(new int[][]{
                {0, 7, 0, 0},
                {7, 7, 0, 0},
                {7, 0, 0, 0},
                {0, 0, 0, 0}
        });
    }
    @Override
    public List<int[][]> getShapeMatrix() {
        return MatrixOperations.deepCopyList(brickMatrix);
    }
}
