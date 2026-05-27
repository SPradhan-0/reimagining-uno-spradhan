package main.game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

import main.gfx.Sprite;


public class NumberCard extends Card {

    
    private int value;

    
    public NumberCard( CardColor color, int value ) throws SlickException {
        super( color );
        this.value = value;
        image = Sprite.get( value, color );
    }

    public int getValue() {
        return value;
    }

    
    @Override
    public String toString() {
        return "(" + color.getDisplayName() + "," + value + ")";
    }

    
    @Override
    public boolean isCompatibleWith( Card card ) {
        if ( card instanceof NumberCard ) { 
            
            return ( card.color == color ) || ( ( (NumberCard) card ).value == value ); 
        } else { 
            
            return card.color == color; 
        }
    }

    @Override
    public void update( GameContainer container ) throws SlickException {
        

    }

}
