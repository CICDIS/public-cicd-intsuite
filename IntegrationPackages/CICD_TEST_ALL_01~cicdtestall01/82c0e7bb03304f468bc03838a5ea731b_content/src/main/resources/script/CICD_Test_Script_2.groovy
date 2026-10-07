import com.sap.gateway.ip.core.customdev.util.Message
def Message processData(Message message) {
    def body = message.getBody(String) ?: ""
    message.setProperty("CICD_TEST_SC_MARKER_2", "processed")
    return message
}
