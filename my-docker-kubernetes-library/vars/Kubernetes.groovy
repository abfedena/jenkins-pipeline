// my-docker-kubernetes-library/vars/Kubernetes.groovy

def deployToKubernetes(String kubeconfigPath, String namespace, String deploymentYaml) {
    // Logic to deploy to Kubernetes
    sh """
    kubectl --kubeconfig=${kubeconfigPath} -n ${namespace} apply -f ${deploymentYaml}
    """
}
