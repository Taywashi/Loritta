package net.perfectdreams.loritta.commands.misc

import net.perfectdreams.loritta.common.commands.CommandArguments
import net.perfectdreams.loritta.common.commands.CommandContext
import net.perfectdreams.loritta.common.commands.CommandExecutor
import net.perfectdreams.loritta.common.commands.declarations.CommandExecutorDeclaration

class PingExecutor : CommandExecutor() {
    companion object : CommandExecutorDeclaration(PingExecutor::class)

    override suspend fun execute(context: CommandContext, args: CommandArguments) {
        context.sendMessage {
            styled(
                prefix = "\uD83C\uDFD3",
                content = "Pong!"
            )

            styled(
                prefix = "\uD83D\uDD37",
                content = "OwO!"
            )
        }
    }
}