public class Arena {
    private Player player1;
    private Player player2;
    private Dice dice;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.dice = new Dice();
    }

    public void startFight() {
        while (player1.isAlive() && player2.isAlive()) {
            Player attacker = (player1.getHealth() <= player2.getHealth()) ? player1 : player2;
            Player defender = (attacker == player1) ? player2 : player1;

            performTurn(attacker, defender);

            System.out.println(attacker.getName() + " attacks, " + defender.getName() + " has " + defender.getHealth() + " health remaining.");
        }

        String winner = player1.isAlive() ? player1.getName() : player2.getName();
        System.out.println("Game Over! The winner is " + winner);
    }

    private void performTurn(Player attacker, Player defender) {
        int attackRoll = dice.roll();
        int defenseRoll = dice.roll();

        int attackDamage = attacker.calculateAttackDamage(attackRoll);
        int defenseStrength = defender.calculateDefense(defenseRoll);
        int damage = Math.max(0, attackDamage - defenseStrength);

        defender.reduceHealth(damage);
    }
}
