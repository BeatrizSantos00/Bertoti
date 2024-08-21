09/08 - 1) Atividade Trecho do livro: Software Engenering at Google
" We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. "

Comentário sobre:

O texto destaca que a diferença entre programação e engenharia de software se resume a três aspectos: **tempo, escala e trade-offs**. Na engenharia de software, é essencial considerar as mudanças ao longo do tempo, gerenciar a escala e a eficiência, e tomar decisões complexas com consequências maiores, frequentemente baseadas em estimativas incertas. Esses fatores tornam a engenharia de software uma prática mais estratégica do que a programação.

12/08 - 2) Atividade Trade Off
Cite 3 exemplos de trade off que foram ou não citados anteriormente na aula


1. Conservação de Energia vs. Conforto**: Uma pessoa pode reduzir o uso de aquecimento ou ar-condicionado para economizar energia e reduzir custos, mas isso pode diminuir o conforto dentro de casa. Alternativamente, aumentar o uso desses dispositivos melhora o conforto, mas aumenta o consumo de energia e os custos.

2. Crescimento Rápido vs. Estabilidade**: Uma empresa pode decidir crescer rapidamente investindo pesadamente em expansão, o que pode aumentar o risco de instabilidade financeira. Em contrapartida, uma abordagem mais cautelosa e estável pode garantir segurança financeira, mas o crescimento pode ser mais lento.

3. Segurança vs. Liberdade**: Em políticas públicas, aumentar a segurança, como a implementação de vigilância mais rigorosa ou restrições de movimento, pode reduzir a liberdade individual. Por outro lado, priorizar a liberdade pode significar menos controle e, potencialmente, menos segurança.

19/08 - 3) Atividade Java

Classe Empresa 

```bash
package engsw;

import java.util.LinkedList;
import java.util.List;


public class Empresa {
	private List<Funcionario> funcionarios = new LinkedList<Funcionario>();
	
	public void cadastrarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public List<Funcionario> buscarFuncionarioporCpf(String cpf){
		List<Funcionario> funcionariosEncontrados = new LinkedList<Funcionario>();
		
		for(Funcionario funcionario:this.funcionarios) {
			if(funcionario.getCpf().equals(cpf))
              funcionariosEncontrados.add(funcionario);
		}
			
		
		return funcionariosEncontrados;
	}
	
	
	public List<Funcionario> getFuncionarios(){
		return funcionarios;
	}
}
 ```

Classe Funcionario

 ```bash
package engsw;

public class Funcionario {
	private String nome;
	private String cpf;
	
	public Funcionario(String cpf, String nome) {
		
		this.cpf = cpf;
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String GetNome() {
		return nome;
	}
}

```
Classe TesteEmpresa 

```bash
package engsw;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TesteEmpresa {
	
@Test 
void test() {
	Empresa CeA = new Empresa();
	
	Funcionario Tecnica = new Funcionario("43943509855", "Bia");
	Funcionario Desenvolvedor = new Funcionario("54583098549", "Tiago");
	
	CeA.cadastrarFuncionario(Tecnica);
	CeA.cadastrarFuncionario(Desenvolvedor);
	
	assertEquals(CeA.getFuncionarios().size(), 2);
	
	List<Funcionario> Desenvolvedores = CeA.buscarFuncionarioporCpf("54583098549");
	assertEquals(Desenvolvedores.get(0).getCpf(),Desenvolvedor.getCpf());
	
	
}

}

```
