package com.codeoftheweb.salvo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@SpringBootApplication
public class SalvoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SalvoApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(PlayerRepository playerRepository,
									  GameRepository gameRepository,
									  GamePlayerRepository gamePlayerRepository,
									  ShipRepository shipRepository,
									  SalvoRepository salvoRepository){
		return (args) -> {
			//save  a couple of players
			Player player1 = new Player("j.bauer@ctu.gov");
			Player player2 = new Player("c.obrian@ctu.gov");
			Player player3 = new Player("kim_bauer@gmail.com");
			Player player4 = new Player("t.almeida@ctu.gov");
			Player player5 = new Player("null");

			playerRepository.save(player1);
			playerRepository.save(player2);
			playerRepository.save(player3);
			playerRepository.save(player4);
			playerRepository.save(player5);

			//save a couple of games

			Date date1 = new Date();
			Date date2 = Date.from(date1.toInstant().plusSeconds(3600));
			Date date3 = Date.from(date1.toInstant().plusSeconds(7200));
			Date date4 = Date.from(date2.toInstant().plusSeconds(3600));
			Date date5 = Date.from(date2.toInstant().plusSeconds(7200));
			Date date6 = Date.from(date3.toInstant().plusSeconds(3600));
			Date date7 = Date.from(date3.toInstant().plusSeconds(7200));
			Date date8 = Date.from(date4.toInstant().plusSeconds(3600));

			Game game1 = new Game(date1);
			Game game2 = new Game(date2);
			Game game3 = new Game(date3);
			Game game4 = new Game(date4);
			Game game5 = new Game(date5);
			Game game6 = new Game(date6);
			Game game7 = new Game(date7);
			Game game8 = new Game(date8);

			gameRepository.save(game1);
			gameRepository.save(game2);
			gameRepository.save(game3);
			gameRepository.save(game4);
			gameRepository.save(game5);
			gameRepository.save(game6);
			gameRepository.save(game7);
			gameRepository.save(game8);

			//save a couple of PlayerGames

			GamePlayer gamePlayer1 = new GamePlayer(date1, game1, player1);
			GamePlayer gamePlayer2 = new GamePlayer(date1, game1, player2);
			GamePlayer gamePlayer3 = new GamePlayer(date2, game2, player1);
			GamePlayer gamePlayer4 = new GamePlayer(date2, game2, player2);
			GamePlayer gamePlayer5 = new GamePlayer(date3, game3, player4);
			GamePlayer gamePlayer6 = new GamePlayer(date3, game3, player2);
			GamePlayer gamePlayer7 = new GamePlayer(date4, game4, player2);
			GamePlayer gamePlayer8 = new GamePlayer(date4, game4, player1);
			GamePlayer gamePlayer9 = new GamePlayer(date5, game5, player4);
			GamePlayer gamePlayer10 = new GamePlayer(date5, game5, player1);
			GamePlayer gamePlayer11 = new GamePlayer(date6, game6, player3);
			GamePlayer gamePlayer12 = new GamePlayer(date6, game6, player5);
			GamePlayer gamePlayer13 = new GamePlayer(date7, game7, player4);
			GamePlayer gamePlayer14 = new GamePlayer(date7, game7, player5);
			GamePlayer gamePlayer15 = new GamePlayer(date8, game8, player3);
			GamePlayer gamePlayer16 = new GamePlayer(date8, game8, player4);

			gamePlayerRepository.saveAll(Arrays.asList(gamePlayer1, gamePlayer2, gamePlayer3, gamePlayer4, gamePlayer5, gamePlayer6, gamePlayer7, gamePlayer8,
										gamePlayer9, gamePlayer10, gamePlayer11, gamePlayer12, gamePlayer13, gamePlayer14, gamePlayer15, gamePlayer16));

			//Save a couple of ships
			String carrier = "Carrier";
			String battleship = "Battleship";
			String submarine = "Submarine";
			String destroyer = "Destroyer";
			String patrolBoat = "Patrol Boat";

			Ship ship1 = new Ship(gamePlayer1, destroyer, Arrays.asList("H2", "H3", "H4"));
			Ship ship2 = new Ship(gamePlayer1, submarine, Arrays.asList("E1", "F1", "G1"));
			Ship ship3 = new Ship(gamePlayer1, patrolBoat, Arrays.asList("B4", "B5"));
			Ship ship4 = new Ship(gamePlayer2, destroyer, Arrays.asList("B5", "C5", "D5"));
			Ship ship5 = new Ship(gamePlayer2, patrolBoat, Arrays.asList("F1", "F2"));
			Ship ship6 = new Ship(gamePlayer3, destroyer, Arrays.asList("B5", "C5", "D5"));
			Ship ship7 = new Ship(gamePlayer3, patrolBoat, Arrays.asList("C6", "C7"));
			Ship ship8 = new Ship(gamePlayer4, submarine, Arrays.asList("A2", "A3", "A4"));
			Ship ship9 = new Ship(gamePlayer4, patrolBoat, Arrays.asList("G6", "H6"));
			Ship ship10 = new Ship(gamePlayer6, destroyer, Arrays.asList("B%", "C%", "D%"));
			Ship ship11 = new Ship(gamePlayer6, patrolBoat, Arrays.asList("C6", "C7"));
			Ship ship12 = new Ship(gamePlayer5, submarine, Arrays.asList("A2", "A3", "A4"));
			Ship ship13 = new Ship(gamePlayer5, patrolBoat, Arrays.asList("G6", "H6"));
			Ship ship14 = new Ship(gamePlayer7, destroyer, Arrays.asList("B5", "C%", "D5"));
			Ship ship15 = new Ship(gamePlayer7, patrolBoat, Arrays.asList("C6", "C7"));
			Ship ship16 = new Ship(gamePlayer8, submarine, Arrays.asList("A2","A3", "A4"));
			Ship ship17 = new Ship(gamePlayer8, patrolBoat, Arrays.asList("G6", "H6"));
			Ship ship18 = new Ship(gamePlayer9, destroyer, Arrays.asList("B5", "C5", "D5"));
			Ship ship19 = new Ship(gamePlayer9, patrolBoat, Arrays.asList("C6", "C7"));
			Ship ship20 = new Ship(gamePlayer10, submarine, Arrays.asList("A2","A3", "A4"));
			Ship ship21 = new Ship(gamePlayer10, patrolBoat, Arrays.asList("G6", "H6"));
			Ship ship22 = new Ship(gamePlayer11, destroyer, Arrays.asList("B5", "C5", "D5"));
			Ship ship23 = new Ship(gamePlayer11, patrolBoat, Arrays.asList("C6", "C7"));
			Ship ship24 = new Ship(gamePlayer15, destroyer, Arrays.asList("B5", "C5", "D5"));
			Ship ship25 = new Ship(gamePlayer15, patrolBoat, Arrays.asList("C6", "C7"));
			Ship ship26 = new Ship(gamePlayer16, submarine, Arrays.asList("A2", "A3", "A4"));
			Ship ship27 = new Ship(gamePlayer16, patrolBoat, Arrays.asList("G6", "H6"));

			shipRepository.saveAll(Arrays.asList(ship1, ship2, ship3, ship4, ship5, ship6, ship7, ship8, ship9,
					                             ship10, ship11, ship12, ship13, ship14, ship15, ship16, ship17, ship18,
												 ship19, ship20, ship21, ship22, ship23, ship24, ship25, ship26, ship27));

			//save a couple of salvoes
			Salvo salvo1 = new Salvo(gamePlayer1, 1, Arrays.asList("B5", "C5", "F1"));
			Salvo salvo2 = new Salvo(gamePlayer2, 1, Arrays.asList("B4", "B5", "B6"));
			Salvo salvo3 = new Salvo(gamePlayer1, 2,Arrays.asList("F2", "D5"));
			Salvo salvo4 = new Salvo(gamePlayer2, 2, Arrays.asList("E1", "H3", "A2"));
			Salvo salvo5 = new Salvo(gamePlayer3, 1, Arrays.asList("A2", "A4", "G6"));
			Salvo salvo6 = new Salvo(gamePlayer4, 1, Arrays.asList("B5", "D5", "C7"));
			Salvo salvo7 = new Salvo(gamePlayer3, 2, Arrays.asList("A3", "H6"));
			Salvo salvo8 = new Salvo(gamePlayer4, 2, Arrays.asList("C5", "C6"));
			Salvo salvo9 = new Salvo(gamePlayer6, 1,Arrays.asList("G6", "H6", "A4"));
			Salvo salvo10 = new Salvo(gamePlayer5, 1, Arrays.asList("H1", "H2", "H3"));
			Salvo salvo11 = new Salvo(gamePlayer6, 2, Arrays.asList("A2", "A3", "D8"));
			Salvo salvo12 = new Salvo(gamePlayer5, 2, Arrays.asList("E1", "F2", "G3"));
			Salvo salvo13 = new Salvo(gamePlayer7, 1, Arrays.asList("A3", "A4", "F7"));
			Salvo salvo14 = new Salvo(gamePlayer8, 1, Arrays.asList("B5", "C6", "H1"));
			Salvo salvo15 = new Salvo(gamePlayer7, 2, Arrays.asList("A2", "G6", "H6"));
			Salvo salvo16 = new Salvo(gamePlayer8, 2, Arrays.asList("C5", "C7", "D5"));
			Salvo salvo17 = new Salvo(gamePlayer9, 1, Arrays.asList("A1", "A2", "A3"));
			Salvo salvo18 = new Salvo(gamePlayer10, 1, Arrays.asList("B5", "B6", "C7"));
			Salvo salvo19 = new Salvo(gamePlayer9, 2, Arrays.asList("G6", "G7", "G8"));
			Salvo salvo20 = new Salvo(gamePlayer10, 2, Arrays.asList("C6", "D6", "E6"));
			Salvo salvo21 = new Salvo(gamePlayer10, 3, Arrays.asList("H1", "H8"));

			salvoRepository.saveAll(Arrays.asList(salvo1, salvo2, salvo3, salvo4, salvo5, salvo6, salvo7, salvo8, salvo9,
												salvo10, salvo11, salvo12, salvo13, salvo14, salvo15, salvo16, salvo17,
												salvo18, salvo19, salvo20, salvo21));
		};
	}
}
