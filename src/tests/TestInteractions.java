package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import levelPieces.BeeHive;
import levelPieces.ClockworkGuard;
import levelPieces.Coin;
import levelPieces.LaserTurret;
import levelPieces.Tunnel;
import levelPieces.Wisp;

class TestInteractions {

	@Test
	// # 1
	void testBeeHiveIneractions() {
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		// we will have our bee at location 8
		BeeHive angryBee = new BeeHive(8);
		gameBoard[8] = angryBee;
		
		
		// then loop through location of player
		for(int i =0; i<GameEngine.BOARD_SIZE;i++) {
			
			if(i==8) {
				// then we want to check if player got hit 
				assertEquals(InteractionResult.HIT, angryBee.interact(gameBoard, i));
			}
			else {
				assertEquals(InteractionResult.NONE, angryBee.interact(gameBoard, i));
			}
			
			
			
		}
		
		
		
	}
	@Test
	// # 2
	void  TestClockworkGuardInteractions() {
		
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		// we will have our bee at location 8 and our initla direction will put 1
		ClockworkGuard guard = new ClockworkGuard(8,1);
		gameBoard[8] = guard;
		
		//  ok now I will loop through player locations and make sure
		// it acts correctly 
		
		for(int i =0; i<GameEngine.BOARD_SIZE;i++) {
			
			if(i==8|| i==7 || i==9) {
				// then we want to check if player got hit 
				assertEquals(InteractionResult.HIT, guard.interact(gameBoard, i));
			}
			else {
				assertEquals(InteractionResult.NONE, guard.interact(gameBoard, i));
			}
			
			
		}
		
		
		
		
		
	}
	
	// ok #3
	
	@Test
	void TestCoinInteractions() {
		
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		// we will have our bee at location 8 and our initla direction will put 1
		
		// loop here through position
		for(int i =0; i<GameEngine.BOARD_SIZE;i++) {
			Coin coins = new Coin(i);
			gameBoard[i] = coins;
				assertEquals(InteractionResult.GET_POINT, coins.interact(gameBoard, i));
				
				
				
			}
		// check if will not give coins when player is at a set location 
		Coin coins = new Coin(8);
		gameBoard[8] = coins;
		for(int i =0; i<GameEngine.BOARD_SIZE;i++) {
			if(i!=8) {
			
				assertEquals(InteractionResult.NONE, coins.interact(gameBoard, i));
				
		
		
		}
		}
		
		
		
		
		
		
	}
	
	

	
	// # 4
	@Test
	void TestLaserTurretInteractions() {
		
		// ok we are gonna check if it gets hit by the laster at postion 8 only
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		// we will have our bee at location 8 and our initla direction will put 1
		LaserTurret laser = new LaserTurret(8);
		gameBoard[8] = laser;
		for(int i =0; i<GameEngine.BOARD_SIZE;i++) {
			if(i==8|| i==6||i==10||i==7||i==9) {
				// if at location 8 =8
				assertEquals(InteractionResult.KILL, laser.interact(gameBoard, i));
				
			}
			else {
				// else kill
				assertEquals(InteractionResult.NONE, laser.interact(gameBoard, i));
				
			}
		}
		
		
		
		
		
	}
	
	// # 5
	@Test
	void TestTunnelInteractions() {
		
		// ok we are gonna check if it gets hit by the laster at postion 8 only
			Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		// we will have our bee at location 8 and our initla direction will put 1
		Tunnel tunnel = new Tunnel(8);
		// add 8 to game baord
		gameBoard[8] = tunnel;
		
		for(int i =0; i<GameEngine.BOARD_SIZE;i++) {
			if(i==8) {
				// if at location 8 =8 check is it advances
				assertEquals(InteractionResult.ADVANCE, tunnel.interact(gameBoard, i));
				
			}
			else {
				assertEquals(InteractionResult.NONE, tunnel.interact(gameBoard, i));
				
				
			}
		}
		
		
	}
	
	
	// # 6
		@Test
		void TestWispInteractions() {
			
			// ok will check if it's at location 8 
			Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
			// we will have our bee at location 8 and our initla direction will put 1
			Wisp wisp = new Wisp(8);
			
			assertEquals(InteractionResult.NONE, wisp.interact(gameBoard, 8));
			// check when player in another location 
			assertEquals(InteractionResult.NONE, wisp.interact(gameBoard, 6));
			
		}


}
