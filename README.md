
# react-native-rootbeer

## Getting started

`$ npm install react-native-rootbeer --save`

### Mostly automatic installation

`$ react-native link react-native-rootbeer`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNRootbeerPackage;` to the imports at the top of the file
  - Add `new RNRootbeerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-react-native-rootbeer'
  	project(':react-native-react-native-rootbeer').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-react-native-rootbeer/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-react-native-rootbeer')
  	```

## Usage
```javascript
import RNRootbeer from 'react-native-rootbeer';

// TODO: What to do with the module?
RNRootbeer;
```
  