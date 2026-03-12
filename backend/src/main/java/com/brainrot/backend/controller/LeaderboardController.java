@GetMapping("/leaderboard")
public List<LeaderboardDTO> leaderboard() {

    return leaderboardService.getLeaderboard();

}
