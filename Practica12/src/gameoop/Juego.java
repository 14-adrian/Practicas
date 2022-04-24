
package gameoop;


/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
//Clase para jugars
public class Juego {
    public void jugar(String battle){
        
        Soldier guerrero = new Soldier();
        Cavalry caballeria = new Cavalry();
        Magician mago = new Magician();
        GameUtil computadora = new GameUtil();
        Aleatoreo r = new Aleatoreo();
        
        switch (battle) {
            case "AD": {
                System.out.println("");
                System.out.println("Guerrero vs Computadora");
                int num = 0;
                while (guerrero.vive() && computadora.vive()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (r.rndAtaque(guerrero.getHr())) {
                        computadora.atacado(guerrero.getAttack());
                    } else {
                        computadora.evita();
                    }

                    if (r.rndAtaque(computadora.getHr())) {
                        guerrero.atacado(computadora.getAttack());
                    } else {
                        guerrero.evita();
                    }
                }
                break;
            }

            case "BD": {
                System.out.println("");
                System.out.println("caballeria vs Computadora");
                int num = 0;
                while (computadora.vive() && caballeria.vive()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (r.rndAtaque(caballeria.getHr())) {
                        computadora.atacado(caballeria.getAttack());
                    } else {
                        computadora.evita();
                    }

                    if (r.rndAtaque(computadora.getHr())) {
                        caballeria.atacado(computadora.getAttack());
                    } else {
                        caballeria.evita();
                    }
                }
                break;
            }

            case "mago": {
                System.out.println("");
                System.out.println("Mago vs Computadora");
                int num = 0;
                while (computadora.vive() && mago.vive()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (r.rndAtaque(mago.getHr())) {
                        computadora.atacado(mago.getAttack());
                    } else {
                        computadora.evita();
                    }

                    if (r.rndAtaque(computadora.getHr())) {
                        mago.atacado(computadora.getAttack());
                    } else {
                        mago.evita();
                    }
                }
                break;
            }

            case "BA": {
                System.out.println("");
                System.out.println("Caballero vs Guerrero");
                int num = 0;
                while (guerrero.vive() && caballeria.vive()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (r.rndAtaque(caballeria.getHr())) {
                        guerrero.atacado(caballeria.getAttack());
                    } else {
                        guerrero.evita();
                    }

                    if (r.rndAtaque(guerrero.getHr())) {
                        caballeria.atacado(guerrero.getAttack());
                    } else {
                        caballeria.evita();
                    }
                }
                break;
            }

            case "CA": {
                System.out.println("");
                System.out.println("Mago vs Guerrero");
                int num = 0;
                while (guerrero.vive() && mago.vive()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (r.rndAtaque(mago.getHr())) {
                        guerrero.atacado(mago.getAttack());
                    } else {
                        guerrero.evita();
                    }

                    if (r.rndAtaque(guerrero.getHr())) {
                        mago.atacado(guerrero.getAttack());
                    } else {
                        mago.evita();
                    }
                }
                break;
            }

            case "AB": {
                System.out.println("");
                System.out.println("Guerrero vs Caballero");
                int num = 0;
                while (caballeria.vive() && guerrero.vive()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (r.rndAtaque(guerrero.getHr())) {
                        caballeria.atacado(guerrero.getAttack());
                    } else {
                        caballeria.evita();
                    }

                    if (r.rndAtaque(caballeria.getHr())) {
                        guerrero.atacado(caballeria.getAttack());
                    } else {
                        guerrero.evita();
                    }
                }
                break;
            }

            case "CB": {
                System.out.println("");
                System.out.println("Mago vs Caballero");
                int num = 0;
                while (caballeria.vive() && mago.vive()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (r.rndAtaque(mago.getHr())) {
                        caballeria.atacado(mago.getAttack());
                    } else {
                        caballeria.evita();
                    }

                    if (r.rndAtaque(caballeria.getHr())) {
                        mago.atacado(caballeria.getAttack());
                    } else {
                        mago.evita();
                    }
                }
                break;
            }

            case "AC": {
                System.out.println("");
                System.out.println("Guerrero vs Mago");
                int num = 0;
                while (mago.vive() && guerrero.vive()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (r.rndAtaque(guerrero.getHr())) {
                        mago.atacado(guerrero.getAttack());
                    } else {
                        mago.evita();
                    }

                    if (r.rndAtaque(mago.getHr())) {
                        guerrero.atacado(mago.getAttack());
                    } else {
                        guerrero.evita();
                    }
                }
                break;
            }

            case "caballeria": {
                System.out.println("");
                System.out.println("Caballero vs Mago");
                int num = 0;
                while (mago.vive() && caballeria.vive()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (r.rndAtaque(caballeria.getHr())) {
                        mago.atacado(caballeria.getAttack());
                    } else {
                        mago.evita();
                    }

                    if (r.rndAtaque(mago.getHr())) {
                        caballeria.atacado(mago.getAttack());
                    } else {
                        caballeria.evita();
                    }
                }
                break;
            }
        }
    }
}
