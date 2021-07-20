# Offline CheatBreaker Bukkit API

[![Releases](https://img.shields.io/github/release/Offline-CheatBreaker/CheatBreakerAPI.svg)](https://github.com/Offline-Cheatbreaker/CheatBreakerAPI/releases)
[![Issues](https://img.shields.io/github/issues/Offline-CheatBreaker/CheatBreakerAPI)](https://github.com/Offline-CheatBreaker/CheatBreakerAPI/issues)
[![Pull Requests](https://img.shields.io/github/issues-pr/Offline-CheatBreaker/CheatBreakerAPI)](https://github.com/Offline-CheatBreaker/CheatBreakerAPI/pulls)
<a href="https://discord.gg/CheatBreaker"><img src="https://discordapp.com/api/guilds/633325309395206156/widget.png?style=shield" alt="Discord Server"></a>

The Offline CheatBreaker API will allow you to detect when a player is running CheatBreaker, enable and disable HUD modules, allow x-ray for your staff, and much more.

## Compatibility

This API has been tested with Spigot 1.7.10, PaperSpigot 1.7.10 and mSpigot 1.7.10 (MineHQ Spigot). However, it can work on other/newer versions as well.

This API can detect people on Offline CheatBreaker 1.7.10 and 1.8.9.

**Please note** that you must add ProtocolLib to your server for the API to work! (You can get the latest one for 1.7.10 [here](https://github.com/dmulloy2/ProtocolLib/releases/tag/3.7.0)).

## Download

The latest release can be found [here](https://github.com/Offline-Cheatbreaker/CheatBreakerAPI/releases/latest).

## Commands

`/cb (username)` - Check if a player is using CheatBreaker.

`/cbm` - Send a message to all CheatBreaker players (Default permission: `cheatbreaker.message`).

`/cbt` - Send a title text to all CheatBreaker players (Default permission: `cheatbreaker.title`).

## Documentation

Documentation can be found on the [wiki pages](https://github.com/Offline-Cheatbreaker/CheatBreakerAPI/wiki).

## Examples

Example plugins can be found under the [`Examples`](/Examples) folder. Those examples will help you integrate the CheatBreaker API into your plugins.

## Reporting an issue

If you suspect an issue you can submit one [here](https://github.com/Offline-CheatBreaker/CheatBreakerAPI/issues).

## Get the Source

1. Install maven `sudo apt-get install maven`
2. Verify installation `mvn -v`
3. Clone the repository `git clone git@github.com:Offline-CheatBreaker/CheatBreakerAPI.git`
4. Navigate to the new folder `cd CheatBreakerAPI`
5. Import `pom.xml` into your IDE

## Compile a Build

1. Navigate to the repository home directory
2. Run `mvn clean install`
3. Find the compiled jar at `target/CheatBreakerAPI.jar`

## Contributing

You can submit a [pull request](https://github.com/Offline-CheatBreaker/CheatBreakerAPI/pulls) with your changes.

## Documentation

Documentation can be found on the [wiki pages](https://github.com/Offline-CheatBreaker/CheatBreakerAPI/wiki).

---

**License:** [GNU/GPL v3](https://github.com/Offline-CheatBreaker/CheatBreakerAPI/blob/master/LICENSE)

## Credits

The original CB API (made by CheatBreaker, LLC) can be found [here](https://github.com/CheatBreaker/CheatBreakerAPI).