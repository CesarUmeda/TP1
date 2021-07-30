package tp1;
import java.util.Scanner;

public class TrabalhoPratico1 {

	public static void main(String[] args) {
		int opcao;
		//String de Clientes. 
		String clientes[][] = new String[20][5];
		//Clientes pré-cadastrados.
		clientes[0][0] = ("Cesar");				
		clientes[0][1] = ("Riacho Fundo");		
		clientes[0][2] = ("40028922");			
		
		clientes[1][0] = ("João");
		clientes[1][1] = ("Aguas Claras");
		clientes[1][2] = ("1337");	
			
		clientes[2][0] = ("Ronaldo");
		clientes[2][1] = ("Fenômeno");
		clientes[2][2] = ("9");
		
		clientes[3][0] = ("Devin");				
		clientes[3][1] = ("Booker");		
		clientes[3][2] = ("70");			
		
		clientes[4][0] = ("Neymar");
		clientes[4][1] = ("Paris Saint Germain");
		clientes[4][2] = ("101010101010");
		
		clientes[5][0] = ("Cr7");				
		clientes[5][1] = ("Ilha da Madeira");		
		clientes[5][2] = ("7777777");			
		
		clientes[6][0] = ("Messi");
		clientes[6][1] = ("Bons Ares");
		clientes[6][2] = ("10101010");
		
		clientes[7][0] = ("LeBron");				
		clientes[7][1] = ("Akron");		
		clientes[7][2] = ("23232323");			
		
		clientes[8][0] = ("Fallen");
		clientes[8][1] = ("Confia no Verdadeiro");
		clientes[8][2] = ("2");
		
		clientes[9][0] = ("Igarashi");				
		clientes[9][1] = ("Japão");		
		clientes[9][2] = ("9.8");			
		//String de produtos, por string e double.
		String produtos[][] = new String[20][10];
		double produtosDouble[][] = new double[30][10];
		//Produtos pré-cadastrados.
		produtos[0][0] = ("Arroz");		
		produtos[0][1] = ("Tipo 1");	
		produtosDouble[0][0] = (45);	
		produtosDouble[0][1] = (3);	
		produtosDouble[0][2] = (56);
		
		produtos[1][0] = ("Feijão");
		produtos[1][1] = ("De corda");
		produtosDouble[1][0] = (56);
		produtosDouble[1][1] = (8);
		produtosDouble[1][2] = (90);
		
		produtos[2][0] = ("Refrigerante");
		produtos[2][1] = ("CocaCola");
		produtosDouble[2][0] = (5);
		produtosDouble[2][1] = (2);
		produtosDouble[2][2] = (80);
		
		produtos[3][0] = ("Biscoito");
		produtos[3][1] = ("CreamCracker");
		produtosDouble[3][0] = (2);
		produtosDouble[3][1] = (1);
		produtosDouble[3][2] = (300);
		
		produtos[4][0] = ("Leite");
		produtos[4][1] = ("Desnatado");
		produtosDouble[4][0] = (60);
		produtosDouble[4][1] = (20);
		produtosDouble[4][2] = (100);
		
		produtos[5][0] = ("Pipoca");
		produtos[5][1] = ("Milho");
		produtosDouble[5][0] = (30);
		produtosDouble[5][1] = (4);
		produtosDouble[5][2] = (69);
		
		produtos[6][0] = ("Sabão");
		produtos[6][1] = ("De coco");
		produtosDouble[6][0] = (12);
		produtosDouble[6][1] = (3);
		produtosDouble[6][2] = (96);
		
		produtos[7][0] = ("Rexona");
		produtos[7][1] = ("Não te Abandona");
		produtosDouble[7][0] = (18);
		produtosDouble[7][1] = (6);
		produtosDouble[7][2] = (121);
		
		produtos[8][0] = ("Carne");
		produtos[8][1] = ("Picanha");
		produtosDouble[8][0] = (70);
		produtosDouble[8][1] = (20);
		produtosDouble[8][2] = (100);
		
		produtos[9][0] = ("Água");
		produtos[9][1] = ("Qboa");
		produtosDouble[9][0] = (10);
		produtosDouble[9][1] = (3);
		produtosDouble[9][2] = (77);
		
        Scanner input = new Scanner(System.in);
        
        do{
            menu(); //Chamada do Menu.
            System.out.println("Digite a opção desejada: ");
            opcao = input.nextInt();
            
            switch(opcao){ 
            case 1:
                cadastroCliente(clientes);
                break;
                
            case 2:
                buscaCliente(clientes);
                break;
                
            case 3:
                cadastroProduto(produtos, produtosDouble);
                break;
                
            case 4:
            	buscaProduto(produtos, produtosDouble);
                break;
            case 5:
            	cadastroVenda(clientes, produtos);
            	break;
            	
            case 6:
            	estoque(produtos, produtosDouble);
            	break;
            }
        } while(opcao != 7);
	}
	
	public static void menu() {
		//Menu.
		System.out.println("____________________________");
		System.out.println("         | MENU |           ");
		System.out.println("1. Cadastro de Novo Cliente ");
        System.out.println("2. Busca por Cliente        ");
        System.out.println("3. Cadastro de Novo Produto ");
        System.out.println("4. Busca por Produto        ");
        System.out.println("5. Cadastro de Venda        ");
        System.out.println("6. Produtos em Estoque      ");
        System.out.println("7. Sair                     ");
        System.out.println("____________________________");
        System.out.println("");
	}
	
	//Método para cadastro de Clientes.
	public static void cadastroCliente(String clientes[][]) {
		
		int quantidade;
		Scanner input = new Scanner(System.in);
		System.out.println("Cadastro de Cliente");
		System.out.println("Por Favor, Digite a quantidade de Clientes que deseja Cadastrar: ");
		System.out.println("");
		quantidade = input.nextInt();
		//For para inserir os dados dos Clientes.
		for(int i = 10; i < quantidade + 10; i++) {
			System.out.println("Nome do Cliente: ");
			clientes[i][0] = input.next();
			System.out.println("Endereço: ");
			clientes[i][1] = input.next();
			System.out.println("Telefone: ");
			clientes[i][2] = input.next();
			System.out.println("");
		}
	}
	
	//Método para Buscar Clientes.
	public static void buscaCliente(String clientes[][]) {
		int num;
		String cliente;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pesquisar Cliente: ");
		cliente = input.next();
		
		//For para buscar na matriz onde está o cliente conforme a String inserida pelo usuário.
		for(int i = 0; i < clientes.length; i++) {
			for(int j = 0; j < 1; j++) {
				if(cliente.equals(clientes[i][j])) {
					System.out.println("Cliente: " + clientes[i][0]);
					System.out.println("Endereço: " + clientes[i][1]);
					System.out.println("Telefone: " + clientes[i][2]);
					System.out.println("");
					//Opção de alteração de dados.
					System.out.println("Deseja alterar os dados desse cliente?");
					System.out.println("1. Sim");
					System.out.println("2. Não");
					num = input.nextInt();
					System.out.println("");
					
					if (num == 1) {
						System.out.println("Nome do Cliente: ");
						clientes[i][0] = input.next();
						System.out.println("Endereço: ");
						clientes[i][1] = input.next();
						System.out.println("Telefone: ");
						clientes[i][2] = input.next();
						System.out.println("");
					return;
					}
				return;
				} 
			}
		}
		System.out.println("Cliente não encontrado!");
		System.out.println("");	
	}
	//Método para cadastro de produto.
	public static void cadastroProduto(String produtos[][], double produtosDouble[][]) {
		
		int quantidade;
		Scanner input = new Scanner(System.in);
		System.out.println("Cadastro de Produto");
		System.out.println("Por Favor, Digite a quantidade de Produtos que deseja Cadastrar: ");
		quantidade = input.nextInt();
		System.out.println("");
		//For para inserir os dados dos produtos.
		for(int i = 10; i < quantidade + 10; i++) {
			
			System.out.println("Nome do Produto: ");
			produtos[i][0] = input.next();
			System.out.println("Descrição: ");
			produtos[i][1] = input.next();
			System.out.println("Valor de compra: ");
			produtosDouble[i][0] = input.nextDouble();
			System.out.println("Lucro: ");
			produtosDouble[i][1] = input.nextDouble();
			System.out.println("Estoque: ");
			produtosDouble[i][2] = input.nextDouble();
			System.out.println("");
		}
	}
	//Método para busca de produto.
	public static void buscaProduto(String produtos[][], double produtosDouble[][]) {
		int num;
		String produto;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pesquisar Produto: ");
		produto = input.next();
		System.out.println("");
		//For para buscar na matriz onde está o produto conforme a String inserida pelo usuário.
		for(int i = 0; i < produtos.length; i++) {
			for(int j = 0; j < 1; j++) {
			if(produto.equals(produtos[i][j])) {
				System.out.println("Produto: " + produtos[i][0]);
				System.out.println("Descrição: " + produtos[i][1]);
				System.out.println("Valor de compra: " + produtosDouble[i][0]);
				System.out.println("Lucro: " + produtosDouble[i][1]);
				System.out.println("Estoque: " + produtosDouble[i][2]);
				System.out.println("");
				//Opção de alteração de dados.
				System.out.println("Deseja alterar os dados desse produto?");
				System.out.println("1. Sim");
				System.out.println("2. Não");
				num = input.nextInt();
				System.out.println("");
				
				if (num == 1) {
					System.out.println("Nome do Produto: ");
					produtos[i][0] = input.next();
					System.out.println("Descrição: ");
					produtos[i][1] = input.next();
					System.out.println("Valor de compra: ");
					produtosDouble[i][0] = input.nextDouble();
					System.out.println("Lucro: ");
					produtosDouble[i][1] = input.nextDouble();
					System.out.println("Estoque: ");
					produtosDouble[i][2] = input.nextDouble();
					System.out.println("");
					
					return;
					}
				return;
				}
			}
		}
		System.out.println("Produto não encontrado!");
		System.out.println("");
	}
	//Método para cadastrar vendas.
	public static void cadastroVenda(String clientes[][], String produtos[][]) {
		int num, num2, opc, quantidade;
		Scanner input = new Scanner(System.in);
		//Imprime todos os clientes da Matriz.
		for(int i = 0; i < clientes.length; i++) {
			System.out.println(i+1 + "- " +clientes[i][0]);
		}
		
		System.out.println("Selecione o Cliente: ");
		num = input.nextInt();
		System.out.println("");
		//Imprime todos os produtos da Matriz.
		for(int i = 0; i < produtos.length; i++) {
			System.out.println(i+1 + "- " +produtos[i][0]);
		}
		
		System.out.println("Selecione o Produto: ");
		num2 = input.nextInt();
		System.out.println("Qual a quantidade de " +produtos[num2-1][0] +" que foi comprada?");
		quantidade = input.nextInt();
		System.out.println("");
		//Seleciona outro produto caso o usuário queira.
		do {
			System.out.println("Deseja selecionar outro produto?");
			System.out.println("1- Sim");
			System.out.println("2- Não");
			opc = input.nextInt();
			System.out.println("");
			
			switch(opc) {	
			case 1:
				for(int i = 0; i < produtos.length; i++) {
					System.out.println(i+1 + "- " +produtos[i][0]);
				}
			
				System.out.println("Selecione o Produto: ");
				num2 = input.nextInt();
				System.out.println("Qual a quantidade de " +produtos[num2-1][0] +" que foi comprada?");
				quantidade = input.nextInt();
				System.out.println("");
				break;
			}	
		}while(opc != 2);
	}
	//Método que imprime estoque.
	public static void estoque(String produtos[][], double produtosDouble[][]) {
		//Imprime todo o estoque com nome do produto e quantidade no estoque.
		for(int i = 0; i < produtos.length; i++) {
			System.out.println(i+1 + "- " +produtos[i][0]);
			System.out.println("Estoque: " +produtosDouble[i][2]);
			System.out.println("");
		}
	}
}
