package tareaUI1.probabilidad;

import java.util.Random;

public class Dados {
	//TODO Implementar Atributos
		private long Aleatorio;
		
		//TODO Implementar Contructores
		public Dados(){
			//As� cogeriamos un dato aleatorio de los milisegundos del sistema. Pero luego...
			Random Aleatorio = new Random(System.currentTimeMillis());
		}
		
		//TODO Implementar Operaciones
		public int LanzarDado(int iNumCaras){
			Random r = new Random();
			int iValorDado = 0;
			switch (iNumCaras){
			 case 4:  
				 iValorDado = r.nextInt(4)+1;  // Entre 0 y 3, m�s 1.  -->  (1 y 4)
                 break;
             case 6:  
            	 iValorDado = r.nextInt(6)+1;  // Entre 0 y 5, m�s 1.  -->  (1 y 6)
                 break;
             case 10:  
            	 iValorDado = r.nextInt(10)+1;  // Entre 0 y 9, m�s 1.  -->  (1 y 10)
                 break;
             default:
            	 System.out.println("N�mero de caras no v�lido.");
			}
			return iValorDado;
			
		}

}
