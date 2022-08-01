# CheatBreaker Bukkit API

[![Releases](https://img.shields.io/github/release/Offline-CheatBreaker/Bukkit-API.svg)](https://github.com/Offline-Cheatbreaker/Bukkit-API/releases)
[![Issues](https://img.shields.io/github/issues/Offline-CheatBreaker/Bukkit-API)](https://github.com/Offline-CheatBreaker/Bukkit-API/issues)
[![Pull Requests](https://img.shields.io/github/issues-pr/Offline-CheatBreaker/Bukkit-API)](https://github.com/Offline-CheatBreaker/Bukkit-API/pulls)
<a href="https://discord.offlinecheatbreaker.com"><img src="https://discordapp.com/api/guilds/633325309395206156/widget.png?style=shield" alt="Discord Server"></a>

The CheatBreaker API will allow you to detect when a player is running CheatBreaker, enable and disable HUD modules, allow x-ray for your staff, and much more.

## Compatibility

This API has been tested with Spigot 1.7.10, PaperSpigot 1.7.10 and mSpigot 1.7.10 (MineHQ Spigot). However, it can work on other/newer versions as well.

This API can detect people on Offline CheatBreaker 1.7.10 and 1.8.9.

## Download

The latest release can be found [here](https://github.com/Offline-Cheatbreaker/Bukkit-API/releases/latest).

## Commands

`/cb (username)` - Check if a player is using CheatBreaker.

`/cbm` - Send a message to all CheatBreaker players (Default permission: `cheatbreaker.message`).

`/cbt` - Send a title text to all CheatBreaker players (Default permission: `cheatbreaker.title`).

## Examples

Example plugins can be found under the [`Examples`](/Examples) folder. Those examples will help you integrate the CheatBreaker API into your plugins.

## Get the Source

1. Install maven `sudo apt-get install maven`
2. Verify installation `mvn -v`
3. Clone the repository `git clone git@github.com:Offline-CheatBreaker/Bukkit-API.git`
4. Navigate to the new folder `cd Bukkit-API`
5. Import `pom.xml` into your IDE

## Compile a Build

1. Clone this repository
3. Run `./compile`
4. Find the compiled jar at `target/CheatBreakerAPI.jar`

## Documentation

Documentation can be found on the [wiki pages](https://github.com/Offline-CheatBreaker/Bukkit-API/wiki).

---

**License:** [GNU/GPL v3](https://github.com/Offline-CheatBreaker/Bukkit-API/blob/master/LICENSE)

## Credits

The original CheatBreaker Bukkit API (made by CheatBreaker, LLC) can be found [here](https://github.com/CheatBreaker/CheatBreakerAPI).
