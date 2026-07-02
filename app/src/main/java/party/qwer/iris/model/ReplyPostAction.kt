package party.qwer.iris.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class ReplyPostAction {
    @SerialName("home")
    HOME,
}
