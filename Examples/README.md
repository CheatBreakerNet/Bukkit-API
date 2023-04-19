# CheatBreaker Bukkit API Examples
These small examples will help you get started with implementing the CB API into your plugins.


## Reporting an issue

If you suspect an issue you can submit one [here](https://github.com/CheatBreakerNet/Bukkit-API/issues).

## Get the Source

1. Install maven `sudo apt-get install maven`
2. Verify installation `mvn -v`
3. Clone the repository `git clone https://github.com/CheatBreakerNet/Bukkit-API.git`
4. Navigate to the new folder `cd Bukkit-API/Examples`
5. Navigate to the example directory you want to compile (e.g. `cd cMiniMap`)
6. Create a folder named `lib`
7. Download our [latest API jar file](https://github.com/CheatBreakerNet/Bukkit-API/releases/latest)
8. Move the `CheatBreakerAPI.jar` file you downloaded to the `lib` folder
9. Import `pom.xml` into your IDE

## Compile a Build

1. Navigate to the example directory (e.g. `cd Bukkit-API/Examples/cMiniMap`)
2. Run `mvn clean install`
3. Find the compiled jar at `target/(Example name).jar`

## Contributing

You can submit a [pull request](https://github.com/CheatBreakerNet/Bukkit-API/pulls) with your changes.
