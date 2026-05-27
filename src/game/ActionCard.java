package main.game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

import main.gfx.Sprite;


public class ActionCard extends Card {

    
    public CardSymbol symbol;

    
    public ActionCard( CardColor color, CardSymbol symbol ) throws SlickException {
        super( color );
        this.symbol = symbol;
        image = Sprite.get( symbol, color );
    }

    
    @Override
    public String toString() {
        return "(" + color.getDisplayName() + "," + symbol.getDisplayName() + ")";
    }

    
    @Override
    public boolean isCompatibleWith( Card card ) {
        if ( color == CardColor.BLACK ) {
            return true; 
            
        }
        if ( card instanceof ActionCard ) { 
            
            return ( card.color == color ) || ( ( (ActionCard) card ).symbol == symbol ); 
        } else { 
            
            return card.color == color; 
        }
    }

    
    public void setColor( CardColor color ) {
        
        if ( this.color == CardColor.BLACK ) {
            
            
            this.color = color;
        }
    }

    
    public CardSymbol getSymbol() {
        return symbol;
    }

    @Override
    public void update( GameContainer container ) throws SlickException {
        

    }

}
