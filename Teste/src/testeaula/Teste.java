package testeaula;
import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int Opcao1 = 0, Opcao2 = 0, Opcao3 = 0,Opcao4 = 0, Alteracao = 1, Alteracao2 = 0 ;
int Preco = 0;
int Creci = 0;
String Tipo = "ADM", SenhaCli = "ADM", LoginCli = "ADM";
String LoginCor = "ADM", SenhaCor = "ADM";
String Login = "", Senha = "";	
String Nome = "ADM", Sobrenome = "CLIENTE", Sexo = "" ;
String NomeCorretor = "ADM", SobrenomeCorretor = "CORRETOR", SexoCorretor = "", CPF = "Nao Cadastrado";
String Imovel = "Nao Cadastrado", cep = "Nao Cadastrado", Rua = "Nao Cadastrado", Bairro = "Nao Cadastrado" ;
String NumeroCasa = "Nao Cadastrado", Cidade = "Nao Cadastrado", Disponibilidade = "Nao Cadastrado";
String cepCorretor = "Nao Cadastrado";
while(Opcao1 != 3) {
	System.out.println("-------------------------");
	System.out.println("|    CORRETORA J.D.I.   |");
	System.out.println("-------------------------");
	System.out.println("|       1-Login         |");
	System.out.println("|       2-Cadastro      |");
	System.out.println("|       3-Sair          |");
	System.out.println("-------------------------");
	Opcao1 = s.nextInt();
	switch (Opcao1) {
	case 1:
	System.out.println("-------------------------");
	System.out.println("|    CORRETORA J.D.I.   |");
	System.out.println("|        LOGIN          |");
	System.out.println("-------------------------");
	System.out.println("-------------------------");
	System.out.println("|      1-CLIENTE        |");
	System.out.println("|      2-CORRETOR       |");
	System.out.println("-------------------------");
	Opcao2 = s.nextInt();
	switch (Opcao2) {
		case 1:
			System.out.println("-------------------------");
			System.out.println("|Digite a Login:        |");
			Login = s.next();
			System.out.println("|Digite a Senha:        |");
			Senha = s.next();
			System.out.println("-------------------------");
			if (Login.equals(LoginCli) && Senha.equals(SenhaCli) || (Tipo.equals("ADM") || Tipo.equalsIgnoreCase("Cliente"))) {
				 System.out.println("---------------------------------");
				 System.out.println("|  Login Realizado com Sucesso  |");
				 System.out.println("---------------------------------");
				 while (Opcao3 != 5) {
				 System.out.println("---------------------------------");
				 System.out.println("|        CORRETORA J.D.I.       |");
				 System.out.println("|          MENU CLIENTE         |");
				 System.out.println("---------------------------------");
				 System.out.println("|       Escolha uma Opcao       |");
				 System.out.println("---------------------------------");
				 System.out.println("|       1-Cadastrar Dados       |");
				 System.out.println("|       2-Consultar             |");
				 System.out.println("|       3-Alterar               |");
				 System.out.println("|       4-Remover               |");
				 System.out.println("|       5-Voltar                |");
				 System.out.println("---------------------------------");
				 Opcao3 = s.nextInt();
				 switch(Opcao3) {
				 case 1:
					 System.out.println("---------------------------------");
					 System.out.println("|      CADASTRO DE DADOS         ");
					 System.out.println("---------------------------------");
					 System.out.println("|Informe o Tipo de Imovel:      |");
					 Imovel = s.next();
					 System.out.println("|Informe Valor do Imovel:       |");
					 Preco = s.nextInt();
					 System.out.println("|Informe o Cep do Imovel:       |");
					 cep = s.next();
					 System.out.println("|Informe a Rua do Imovel:       |");
					 Rua = s.next();
					 System.out.println("|Informe Bairro do Imovel:      |");
					 Bairro = s.next();
					 System.out.println("|Infome Numero do Imovel:       |");
					 NumeroCasa = s.next();
					 System.out.println("|Informe a Cidade do Imovel:    |");
					 Cidade = s.next();
					 System.out.println("|Qual disponibilidade do Imovel |");
					 System.out.println("|     Venda ou Aluguel:         |");
					 Disponibilidade = s.next();
					 System.out.println("---------------------------------");
				 break;
				 case 2:
					 System.out.println("---------------------------------");
					 System.out.println("|      CONSULTA DE DADOS        |");
					 System.out.println("---------------------------------");
					 String Espaco = " ";
					 String Nome1 = Nome.concat(Espaco);
					 String Completo = Nome1.concat(Sobrenome);
					 System.out.printf("Nome do Usuario: %s\n", Completo);
					 System.out.printf("Sexo do Usuario: %s\n", Sexo);
					 System.out.printf("Login do Usuario: %s\n", LoginCli);
					 System.out.printf("Senha do Usuario: %s\n", SenhaCli);
					 System.out.printf("Tipo da Conta: Cliente\n");
					 System.out.printf("Tipo de Imovel: %s\n", Imovel);
					 System.out.printf("Valor do Imovel: %d\n", Preco);
					 System.out.printf("CEP: %s\n", cep);
					 System.out.printf("Localidade: %s\n", Rua);
					 System.out.printf("Numero: %s\n", NumeroCasa);
					 System.out.printf("Bairro: %s\n", Bairro);
					 System.out.printf("Cidade %s\n", Cidade);
					 System.out.printf("Disponibilidade do Imovel: %s\n", Disponibilidade);
					 System.out.println("---------------------------------");
				 break;
				 case 3:
					 while (Alteracao != 9) {
						 System.out.println("---------------------------------");
						 System.out.println("|     ALTERACAO DE DADOS        |");
					     System.out.println("---------------------------------");
					     System.out.println("|Oque voce deseja alterar;      |");
					     System.out.println("|1-Login                        |");
					     System.out.println("|2-Senha                        |");
					     System.out.println("|3-Nome e Sexo                  |");
					     System.out.println("|4-Tipo Imovel                  |");
					     System.out.println("|5-Valor Imovel                 |");
					     System.out.println("|6-CEP                          |");
					     System.out.println("|7-Endereco                     |");
					     System.out.println("|8-Disponibilidade              |");
					     System.out.println("|9-Voltar                       |");
					     System.out.println("---------------------------------");
					     Alteracao = s.nextInt();
					     switch (Alteracao) {
					        case 1:
					        	System.out.println("---------------------------------");
					        	System.out.println("|Defina seu Novo Login:          |");
					        	LoginCli = s.next();
					        	System.out.println("---------------------------------");
					        break;
					        case 2:
					        	System.out.println("---------------------------------");
					        	System.out.println("|Defina sua Nova Senha:         |");
					        	SenhaCli = s.next();
					        	System.out.println("---------------------------------");
					        break;
					        case 3:
					        	System.out.println("---------------------------------");
					        	System.out.println("|Altere seu Nome:               |");
					        	Nome = s.next();
					        	System.out.println("|Altere seu Sobrenome:          |");
					        	Sobrenome = s.next();
					        	System.out.println("|Altere seu Sexo:               |");
					        	Sexo = s.next();
					        	System.out.println("---------------------------------");
					        break;
					        case 4:
					        	System.out.println("---------------------------------");
					        	System.out.println("|Defina novo tipo do Imovel:    |");
					        	Imovel = s.next();
					        	System.out.println("---------------------------------");
					        break;
					        case 5:
					        	System.out.println("---------------------------------");
					        	System.out.println("|Altere Valor do Imovel:        |");
					        	Preco = s.nextInt();
					        	System.out.println("---------------------------------");
					        break;
					        case 6:
					        	System.out.println("---------------------------------");
					        	System.out.println("|Defina novo cep:               |");
					        	cep = s.next();
					        	System.out.println("---------------------------------");
					        break;
					        case 7: 
					        	System.out.println("---------------------------------");
					        	System.out.println("|Inforeme Rua:                  |");
					        	Rua = s.next();
					        	System.out.println("Infome Numero:                  |");
					        	NumeroCasa = s.next();
					        	System.out.println("|Imforme Bairro:                |");
					        	Bairro = s.next();
					        	System.out.println("|Informe Cidade:                |");
					        	Cidade = s.next();
					        	System.out.println("---------------------------------");
					        break;
					        case 8:
					        	System.out.println("------------------------------------");
					        	System.out.println("|Altere Disponibilidade do Imovel: |");
					        	Disponibilidade = s.next();
					        	System.out.println("------------------------------------");
					        break;
					        case 9:
					        	System.out.println("---------------------------------");
					        	System.out.println("|     Voce Voltou para Menu     |");
					        	System.out.println("---------------------------------");
					        break;
					        default:
					        	System.out.println("---------------------------------");
					        	System.out.println("|           INVALIDO            |"); 
					        	System.out.println("---------------------------------");
					        break;
					        
					     }//SwitchAlteracao
					     }//WhileAlteracao
				 case 4:
					 System.out.println("---------------------------------");
					 System.out.println("|         REMOVER CONTA         |");
					 System.out.println("---------------------------------");
				 break;
				 case 5:
					 System.out.println("---------------------------------");
					 System.out.println("|     Voce Voltou ao Login      |"); 
					 System.out.println("---------------------------------");
				 break;
				 default:
					 System.out.println("---------------------------------");
					 System.out.println("|           INVALIDO            |"); 
					 System.out.println("---------------------------------");
				    break;
				 }//Fim SwitchOpcao3
				 }//Fim WhileOpcao 3
				
			}else {
				System.out.println("----------------------");
				System.out.println("|   LOGIN INVALIDO   |");
				System.out.println("----------------------");
			}
		break;
		case 2:
			System.out.println("-------------------------");
			System.out.println("|Digite a Login:        |");
			Login = s.next();
			System.out.println("|Digite a Senha:        |");
			Senha = s.next();
			System.out.println("-------------------------");
			if (Login.equals(LoginCor) && Senha.equals(SenhaCor) || (Tipo.equals("ADM") || Tipo.equalsIgnoreCase("Corretor"))) {
				 System.out.println("---------------------------------");
				 System.out.println("|  Login Realizado com Sucesso  |");
				 System.out.println("---------------------------------");
				 while (Opcao4 != 6) {
				 System.out.println("---------------------------------");
				 System.out.println("|        CORRETORA J.D.I.       |");
				 System.out.println("|         MENU CORRETOR         |");
				 System.out.println("---------------------------------");
				 System.out.println("|       Escolha uma Opcao       |");
				 System.out.println("---------------------------------");
				 System.out.println("|       1-Cadastrar Dados       |");
				 System.out.println("|       2-Consultar             |");
				 System.out.println("|       3-Disponibilidade       |");
				 System.out.println("|       4-Remover               |");
				 System.out.println("|       5-Alterar               |");
				 System.out.println("|       6-Voltar                |");
				 System.out.println("---------------------------------");
				 Opcao4 = s.nextInt();
				 switch(Opcao4) {
				 case 1:
				     System.out.println("---------------------------------");
					 System.out.println("|      CADASTRO DE DADOS         ");
					 System.out.println("---------------------------------");
					 System.out.println("|Infororme seu CRECI:           |");
					 Creci = s.nextInt();
					 System.out.println("|Informe seu CPF:               |");
					 CPF = s.next();
					 System.out.println("|Informe seu CEP:               |");
					 cepCorretor = s.next();
					 System.out.println("---------------------------------");
				 break;
				 case 2:
				     System.out.println("---------------------------------");
				     System.out.println("|      CONSULTA DE DADOS        |");
					 System.out.println("---------------------------------");
					 String Espaco = " ";
					 String Nome2 = NomeCorretor.concat(Espaco);
					 String Completo2 = Nome2.concat(SobrenomeCorretor);
					 System.out.printf("Nome do Usuario: %s\n", Completo2);
					 System.out.printf("Sexo do Usuario: %s\n", SexoCorretor);
					 System.out.printf("Login do Usuario: %s\n", LoginCor);
					 System.out.printf("Senha do Usuario: %s\n", SenhaCor);
					 System.out.printf("Tipo da Conta: Corretor\n");
					 System.out.printf("CRECI: %d\n", Creci);
					 System.out.printf("CPF: %s\n", CPF);
					 System.out.printf("CEP: %s\n", cepCorretor);
					 System.out.println("---------------------------------");
				 break;
				 case 3:
					 System.out.println("---------------------------------");
					 System.out.println("|   Diponibilidade de Imoveis   |");
					 System.out.println("---------------------------------");
					    if (Disponibilidade.equalsIgnoreCase("venda")||  Disponibilidade.equalsIgnoreCase("aluguel") ) {
							System.out.println("------------------------------------");
							System.out.printf("PARA: %s\n", Disponibilidade);
							System.out.printf("Dono: %s\n", Nome," %s\n", Sobrenome );
							System.out.printf("Tipo de Imovel: %s\n", Imovel);
							System.out.printf("Valor do Imovel: %d\n", Preco);
							System.out.printf("CEP: %s\n", cep);
							System.out.printf("Localidade: %s\n", Rua);
							System.out.printf("Numero: %s\n", NumeroCasa);
							System.out.printf("Bairro: %s\n", Bairro);
							System.out.printf("Cidade %s\n", Cidade);
							System.out.println("------------------------------------");
						}else {
							System.out.println("---------------------------------");
						    System.out.println("|   Nao a Imoveis Disponiveis   |");
						    System.out.println("---------------------------------");	
						}
				 break;
				 case 4: 
					 System.out.println("---------------------------------");
					 System.out.println("|         REMOVER CONTA         |");
					 System.out.println("---------------------------------");
				 break;
				 case 5:
				     while (Alteracao2 != 7){
				     System.out.println("---------------------------------");
					 System.out.println("|     ALTERACAO DE DADOS        |");
					 System.out.println("---------------------------------");
					 System.out.println("|Oque voce deseja alterar;      |");
					 System.out.println("|1-Login                        |");
					 System.out.println("|2-Senha                        |");
					 System.out.println("|3-Nome e Sexo                  |");
					 System.out.println("|4-CRECI                        |");
					 System.out.println("|5-CPF                          |");
					 System.out.println("|6-CEP                          |");
					 System.out.println("|7-Voltar                       |");
					 System.out.println("---------------------------------"); 
					 Alteracao2 = s.nextInt();
				     switch (Alteracao2){
				    	 case 1:
				        	 System.out.println("---------------------------------");
				        	 System.out.println("|Defina seu Novo Login:          |");
				        	 LoginCor = s.next();
				        	 System.out.println("---------------------------------");
				         break;
				         case 2:
				        	 System.out.println("---------------------------------");
				        	 System.out.println("|Defina sua Nova Senha:         |");
				        	 SenhaCor = s.next();
				        	 System.out.println("---------------------------------");
				        break;
				        case 3:
				        	System.out.println("---------------------------------");
				        	System.out.println("|Altere seu Nome:               |");
				        	NomeCorretor = s.next();
				        	System.out.println("|Altere seu Sobrenome:          |");
				        	SobrenomeCorretor = s.next();
				        	System.out.println("|Altere seu Sexo:               |");
				        	SexoCorretor = s.next();
				        	System.out.println("---------------------------------");
				        break;
				        case 4:
				        	System.out.println("---------------------------------");
				        	System.out.println("|Altere seu CRECI:              |");
				        	Creci = s.nextInt();
				        	System.out.println("---------------------------------");
				        break;
				        case 5:
				        	System.out.println("---------------------------------");
				        	System.out.println("|Altere seu CPF:                |");
				        	CPF = s.next();
				        	System.out.println("---------------------------------");
				        break;
				        case 6:
				        	System.out.println("---------------------------------");
				        	System.out.println("|Altere seu CEP:                |");
				        	cepCorretor = s.next();
				        	System.out.println("---------------------------------");
				        break;
				        case 7:
				        	System.out.println("---------------------------------");
				        	System.out.println("|     Voce Voltou para Menu     |");
				        	System.out.println("---------------------------------");
				        break;
				        default:
				        	System.out.println("---------------------------------");
							System.out.println("|           INVALIDO            |"); 
							System.out.println("---------------------------------");
				    	break; 
				    	 }//Fechamento switch Alteracao2
				    	 }//Fechamento While  Alteracao2
				 case 6:
					 System.out.println("---------------------------------");
				     System.out.println("|     Voce Voltou ao Login      |"); 
					 System.out.println("---------------------------------");
				 break;
				 default:
					 System.out.println("---------------------------------");
					 System.out.println("|           INVALIDO            |"); 
					 System.out.println("---------------------------------");
				 break;
					 
				 
				 
				 
				 }//FimSwitch
				 }//FimWhileOpcao4	
			}else {
				System.out.println("----------------------");
				System.out.println("|   LOGIN INVALIDO   |");
				System.out.println("----------------------");
			}
		break;
		default:
			System.out.println("---------------------------------");
			System.out.println("|           INVALIDO            |"); 
			System.out.println("---------------------------------");
	    break;
			
	}//FimSwitch opcao2
	
	
	
	
    break;
	case 2:
	System.out.println("--------------------------------------");
	System.out.println("|              CADASTRO              |");
	System.out.println("--------------------------------------");
	System.out.println("|INFORME SEU TIPO: (CLIENTE|CORRETOR)|");
	Tipo = s.next();
	System.out.println("--------------------------------------");
    if (Tipo.equalsIgnoreCase("cliente")){	
    	System.out.println("|Informe seu Nome                    |");
		Nome = s.next();
		System.out.println("|Informe seu Sobrenome               |");
		Sobrenome = s.next();
		System.out.println("|Informe seu Sexo:                   |");
		Sexo = s.next();
		System.out.println("|Defina seu Login:                   |");
		LoginCli = s.next();
		System.out.println("|Defina Sua Senha:                   |");
		SenhaCli = s.next();
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("|     CADASTRADO COM SUCESSO!!!    |");
		System.out.println("------------------------------------");
	    }else {
	    	System.out.println("|Informe seu Nome                    |");
			NomeCorretor = s.next();
			System.out.println("|Informe seu Sobrenome               |");
			SobrenomeCorretor = s.next();
			System.out.println("|Informe seu Sexo:                   |");
			SexoCorretor = s.next();
			System.out.println("|Defina seu Login:                   |");
			LoginCor = s.next();
			System.out.println("|Defina Sua Senha:                   |");
			SenhaCor = s.next();
			System.out.println("------------------------------------");
			System.out.println("------------------------------------");
			System.out.println("|     CADASTRADO COM SUCESSO!!!    |");
			System.out.println("------------------------------------");
	    }
	break;
	case 3:
	System.out.println("---------------------------------");
	System.out.println("|     Voce Fechou o Programa    |"); 
	System.out.println("---------------------------------");
	break;
	default:
	System.out.println("---------------------------------");
	System.out.println("|           INVALIDO            |"); 
	System.out.println("---------------------------------");
    break;


	}//FimSwitchOpcao1
}//FimWhile1
	}
	
	}
