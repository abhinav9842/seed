node(){
    stage('initialize'){
        echo "seed job"
        checkout scm
        def rootdir = pwd()
        
        def main = load "${rootdir}/main.groovy"
        main.manage()
    }
}
