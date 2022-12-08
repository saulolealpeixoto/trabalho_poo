    public class PessoaJuridica extends Pessoa {
        protected String RazaoSocial;
        protected String Cnpj;

        public String getRazaoSocial(){
            return this.RazaoSocial;
        }

        public void setRazaoScial(String RazaoSocial){
            this.RazaoSocial = RazaoSocial;
        }

        public String getCnpj(){
            return this.Cnpj;
        }

        public void setCnpj(String Cnpj){
            this.Cnpj = Cnpj;
        }

        public String toString(){
            return this.RazaoSocial+this.Cnpj;
        }

    }